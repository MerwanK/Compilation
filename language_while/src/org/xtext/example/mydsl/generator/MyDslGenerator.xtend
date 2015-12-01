/*
 * generated by Xtext
 */
 
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.Programme
import org.xtext.example.mydsl.myDsl.Fonction
import org.xtext.example.mydsl.myDsl.Input
import org.xtext.example.mydsl.myDsl.Output
import org.xtext.example.mydsl.myDsl.Commandes
import org.xtext.example.mydsl.myDsl.Commande
import org.xtext.example.mydsl.myDsl.AffectVar
import org.xtext.example.mydsl.myDsl.While
import org.xtext.example.mydsl.myDsl.For
import org.xtext.example.mydsl.myDsl.If
import org.xtext.example.mydsl.myDsl.Foreach
import org.xtext.example.mydsl.myDsl.Vars
import org.xtext.example.mydsl.myDsl.Exprs
import org.xtext.example.mydsl.myDsl.Expr
import org.xtext.example.mydsl.myDsl.ExprSimple
import org.xtext.example.mydsl.myDsl.LExpr
import org.xtext.example.mydsl.myDsl.ExprAnd
import org.xtext.example.mydsl.myDsl.ExprOr
import org.xtext.example.mydsl.myDsl.ExprNot
import org.xtext.example.mydsl.myDsl.ExprEq
import org.xtext.example.mydsl.myDsl.Cons
import org.xtext.example.mydsl.myDsl.Liste
import org.xtext.example.mydsl.myDsl.Hd
import org.xtext.example.mydsl.myDsl.Tl
import org.xtext.example.mydsl.myDsl.SymboleEx
import org.xtext.example.mydsl.myDsl.ExprNotNot
import org.xtext.example.mydsl.myDsl.ExprNotDo
import javax.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.FileWriter
import java.io.BufferedWriter
import org.eclipse.xtext.resource.XtextResourceSet
import java.io.File
import org.xtext.example.mydsl.MyDslStandaloneSetup
import org.eclipse.emf.common.util.URI
import java.util.ArrayList
import java.util.List
import java.util.Iterator
import java.util.LinkedList

/* Last */
/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator implements IGenerator {
	
	private var int i_default = 1;
	private var int i_if = 2;
	private var int i_while = 3;
	private var int i_foreach = 4;
	private var int i_for = 5;
	private var String nomPP = "onEssayeVoir";
	List<Integer> listIndent ;   //Une solution pour les différents niveau d'indent
	 
	def public File generationDuPrettyPrinter(String entree, String nameWhpp,int indIf,
		int indWhile, int indForeach, int indFor, int indDefault){
	
		i_default = indDefault;	
		i_if = indIf;
		i_while = indWhile;
		i_foreach = indForeach;
		i_for = indFor;
		nomPP = nameWhpp;
		val injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(XtextResourceSet);
		val uri = URI.createURI(entree);
		val xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
		val fstream = new FileWriter(nameWhpp);
 		val buff = new BufferedWriter(fstream);
  		for(p: xtextResource.allContents.toIterable.filter(Programme))
			buff.write(p.compile().toString);
  		buff.close();
  		return new File(nameWhpp);
		
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa){
		for(p: resource.allContents.toIterable.filter(Programme)){
			fsa.generateFile(nomPP + ".whpp",p.compile()); 
		}
	}
	
	def indentation(List<Integer> listInd){	
		var String indent = "";
			
		for (i : 0 ..< listInd.size){
			var cpt = listInd.get(i);
			while(cpt>0){
				indent = indent + " ";
				cpt = cpt-1;
			}
		}
		println(indent);
	}
	
	
	def compile(Programme p)'''
   		«FOR f :p.fonct»«f.compile()»
   		
   		«ENDFOR»
   '''
		
   def compile(Fonction f) '''
		fonction «f.symbole»:«listIndent = new LinkedList<Integer>()»«listIndent.add(i_default)»
		read «f.in.compile()»
		%
		«f.com.compile(listIndent)»
		%
		write «f.out.compile()»
   	'''
   
   def compile(Input i)'''
   «i.var1»«FOR v :i.var2», «v»«ENDFOR»'''
   
   def compile(Output o)'''
   «o.var1»«FOR v :o.var2», «v»«ENDFOR»'''
   
   def compile(Commandes cos, List<Integer> l)'''
   «indentation(l)»«cos.com1.compile(l)»«FOR v :cos.com2» ; 
   «indentation(l)»«v.compile(l)»«ENDFOR»'''
   
   def compile(Commande co, List<Integer> l)'''
   		«IF co.nop != null»nop«
   		ENDIF»«IF co.affectVar != null»«co.affectVar.compile()»«
   		ENDIF»«IF co.whileC != null»«co.whileC.compile(l)»«
   		ENDIF»«IF co.forC != null»«co.forC.compile(l)»«
   		ENDIF»«IF co.ifC != null»«co.ifC.compile(l)»«
   		ENDIF»«IF co.foreachC != null»«co.foreachC.compile(l)»«
   		ENDIF»'''	
   
     
   def compile(AffectVar av)'''
   «av.var1.compile» := «av.exp.compile»'''
   
   def compile(While w, List<Integer> l)'''
   while «w.exp2.compile» do«l.add(i_while)»
   «w.com3.compile(l)»«l.remove(l.size-1)»
   «indentation(l)»od'''
      
   def compile(For f, List<Integer> l)'''
   for «f.exp3.compile» do«l.add(i_for)»
   «f.com4.compile(l)»«l.remove(l.size-1)»
   «indentation(l)»od'''
   
   def compile(If ifc, List<Integer> l)'''
   if «ifc.exp4.compile» then«l.add(i_if)»
   «ifc.com5.compile(l)»«l.remove(l.size-1)»
   «indentation(l)»else«l.add(i_if)»
   «ifc.com6.compile(l)»«l.remove(l.size-1)»
   «indentation(l)»fi'''
   
   def compile(Foreach fe, List<Integer> l)'''
   foreach «fe.exp5.compile» in «fe.exp6.compile» do«l.add(i_foreach)»
   «fe.com7.compile(l)»«l.remove(l.size-1)»
   «indentation(l)»od'''
   
   def compile(Vars v)'''
   «v.var2»«FOR va :v.var3», «va»«ENDFOR»'''
   
   def compile(Exprs exps)'''
   «exps.exprS.compile »«FOR v :exps.exprS2», «v.compile»«ENDFOR»'''
   
   def compile(Expr ex)'''
   «IF ex.expA != null»«ex.expA.compile»«
   ENDIF»«IF ex.expS != null»«ex.expS.compile»«
   ENDIF»'''
   
   def compile(ExprSimple es)'''
   		«IF es.vide != null»nil«
   		ENDIF»«IF es.variable != null»«es.variable»«
   		ENDIF»«IF es.symbole != null»«es.symbole»«
   		ENDIF»«IF es.cons != null»«es.cons.compile»«
   		ENDIF»«IF es.liste != null»«es.liste.compile»«
   		ENDIF»«IF es.hd != null»«es.hd.compile»«
   		ENDIF»«IF es.tl != null»«es.tl.compile»«
   		ENDIF»«IF es.symbolEx != null»«es.symbolEx.compile»«
   		ENDIF»'''
   
   def compile(Cons ce)'''
   (cons «ce.le1.compile»)'''
   
   def compile(Liste lie)'''
   (list «lie.le2.compile»)'''
   
   def compile(Hd h)'''
   (hd «h.le3.compile»)'''
   
   def compile(Tl t)'''
   (tl «t.le4.compile»)'''
   
   def compile(SymboleEx sex)'''
   («sex.p» «sex.le5.compile»)'''
   
   def compile(ExprAnd ea)'''
   «ea.expO.compile»«FOR v:ea.expO2» and «v.compile»«ENDFOR»'''
   
   def compile(ExprOr eo)'''
   «eo.expN.compile»«FOR v:eo.expN2» or «v.compile»«ENDFOR»'''
   
   def compile(ExprNot en)'''
	«IF en.exprNotNot != null»«en.exprNotNot.compile»«ENDIF»
	«IF en.exprNotDo != null»«en.exprNotDo.compile»«ENDIF»'''
	
   def compile(ExprNotNot enn)'''
   not «enn.expEq1.compile»'''
   	
   def compile(ExprNotDo end)'''
   «end.expEq2.compile»
   '''
   
   def compile(ExprEq eeq)'''
	«(eeq.expS1.compile +  " =? " + eeq.expS2.compile) ?: ("(" + eeq.expR.compile + ")")»'''
   
   def compile(LExpr a)'''
   «FOR v:a.expLe»«v.compile»«ENDFOR»''' 

   
}