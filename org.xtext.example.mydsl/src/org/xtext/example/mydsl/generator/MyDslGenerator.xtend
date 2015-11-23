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


/* Last */
/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa){ 
			//					int i_if, int i_while, int i_foreach, int i_for) {
		for(p: resource.allContents.toIterable.filter(Programme)){
			fsa.generateFile('pp.whpp',p.compile); 
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		}
	}
	
	var int i = 3;
	var int n = 1;
	
	def indentation(int k){
		var int j = k;
		var String indent = "";
		while(j>0){
			indent = indent + " ";
			j = j-1;
		}
		return indent;
	}
	
	def compile(Programme p)'''
   		«FOR f :p.fonct»«f.compile»
   		
   		«ENDFOR»
   '''
		
   def compile(Fonction f) '''
		fonction «f.symbole»:
		read «f.in.compile»
		%
		«f.com.compile»
		%
		write «f.out.compile»
   	'''
   
   def compile(Input i)'''
   		«i.var1»«FOR v :i.var2», «v»«ENDFOR»
   '''
   
   def compile(Output o)'''
   		«o.var1»«FOR v :o.var2», «v»«ENDFOR»
   '''
   
   def compile(Commandes cos)'''
   		«cos.com1.compile»«FOR v :cos.com2», «v.compile»«ENDFOR»
   '''
   
   def compile(Commande co)'''
   		«IF co.nop != null»nop«
   		ENDIF»«IF co.affectVar != null»«co.affectVar.compile»«
   		ENDIF»«IF co.whileC != null»«co.whileC.compile»«
   		ENDIF»«IF co.forC != null»«co.whileC.compile»«
   		ENDIF»«IF co.ifC != null»«co.whileC.compile»«
   		ENDIF»«IF co.foreachC != null»«co.whileC.compile»«
   		ENDIF»
   '''	
   
     
   def compile(AffectVar av)'''
   «av.var1.compile» := «av.exp.compile»
   '''
   
   def compile(While w)'''
   while
   «indentation(i)»«w.exp2.compile»
   do 
   «indentation(i)»«w.com3.compile»
   od
   '''
      
   def compile(For f)'''
   for
   «indentation(i)»«f.exp3.compile»
   do
   «indentation(i)»«f.com4.compile»
   od 
   '''
   
   def compile(If ifc)'''
   if
   «indentation(i)»«ifc.exp4.compile»
   then
   «indentation(i)»«ifc.com5.compile»
   else
   «indentation(i)»«ifc.com6.compile»
   fi
   '''
   
   def compile(Foreach fe)'''
   foreach
   «indentation(i)»«fe.exp5.compile»
   in
   «indentation(i)»«fe.exp6.compile»
   do
   «indentation(i)»«fe.com7.compile»
   od
   '''
   
   def compile(Vars v)'''
   '''
   
   def compile(Exprs exps)'''
   «exps.exprS.compile »«FOR v :exps.exprS2», «v.compile» «ENDFOR»
   '''
   
   def compile(Expr ex)'''
   «IF ex.expA != null»«ex.expA.compile»«
   ENDIF»«IF ex.expS != null»«ex.expS.compile»«
   ENDIF»
   '''
   
   def compile(ExprSimple es)'''
   lol
   '''
   
   def compile(ExprAnd ea)'''
   mdr
   '''
   
}