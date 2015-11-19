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
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(f: resource.allContents.toIterable.filter(Fonction)){
			fsa.generateFile('pp.whpp',f.compile); 
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		}
	}
	
   def compile(Fonction f) '''
		fonction «f.symbole» : read «f.in.compile» % «f.com.compile» % write «f.out.compile»
   		   '''
   
   def compile(Input i)'''
   		«i.var1» «FOR v :i.var2»
   			, «i.var2»
   		«ENDFOR»
   '''
   
   def compile(Output o)'''
   		«o.var1» «FOR v :o.var2»
   			, «o.var2»
   		«ENDFOR»
   '''
   
   def compile(Commandes co)'''
   '''
}
/* 

package org.example.domainmodel.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.example.domainmodel.domainmodel.Entity
import org.example.domainmodel.domainmodel.Feature
import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject

class DomainmodelGenerator implements IGenerator {

  @Inject extension IQualifiedNameProvider

  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    for(e: resource.allContents.toIterable.filter(Entity)) {
      fsa.generateFile(
        e.fullyQualifiedName.toString("/") + ".java",
        e.compile)
    }
  }

  def compile(Entity e) ''' 
    «IF e.eContainer.fullyQualifiedName != null»
      package «e.eContainer.fullyQualifiedName»;
    «ENDIF»
    
    public class «e.name» «IF e.superType != null
            »extends «e.superType.fullyQualifiedName» «ENDIF»{
      «FOR f:e.features»
        «f.compile»
      «ENDFOR»
    }
  '''

  def compile(Feature f) '''
    private «f.type.fullyQualifiedName» «f.name»;
    
    public «f.type.fullyQualifiedName» get«f.name.toFirstUpper»() {
      return «f.name»;
    }
    
    public void set«f.name.toFirstUpper»(«f.type.fullyQualifiedName» «f.name») {
      this.«f.name» = «f.name»;
    }
  '''
}*/