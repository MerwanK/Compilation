/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Programme;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Model> _filter = Iterables.<Model>filter(_iterable, Model.class);
    for (final Model e : _filter) {
      CharSequence _compile = this.compile(e);
      fsa.generateFile("pp.whpp", _compile);
    }
  }
  
  public CharSequence compile(final Model m) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field p is undefined for the type MyDslGenerator"
      + "\ncompile cannot be resolved");
  }
  
  public CharSequence compile(final Programme p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("   ");
    _builder.newLine();
    return _builder;
  }
}
