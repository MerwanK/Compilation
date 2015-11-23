/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.AffectVar;
import org.xtext.example.mydsl.myDsl.Commande;
import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.Fonction;
import org.xtext.example.mydsl.myDsl.For;
import org.xtext.example.mydsl.myDsl.Foreach;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.Input;
import org.xtext.example.mydsl.myDsl.Output;
import org.xtext.example.mydsl.myDsl.Programme;
import org.xtext.example.mydsl.myDsl.While;

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
    Iterable<Programme> _filter = Iterables.<Programme>filter(_iterable, Programme.class);
    for (final Programme p : _filter) {
      CharSequence _compile = this.compile(p);
      fsa.generateFile("pp.whpp", _compile);
    }
  }
  
  /**
   * def indentation(int k){
   * var String indent = "";
   * while(k!=0){
   * indent += " ";
   * k = k-1;
   * }
   * }
   */
  public CharSequence compile(final Programme p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Fonction> _fonct = p.getFonct();
      for(final Fonction f : _fonct) {
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Fonction f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fonction ");
    String _symbole = f.getSymbole();
    _builder.append(_symbole, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("read ");
    Input _in = f.getIn();
    CharSequence _compile = this.compile(_in);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    Commandes _com = f.getCom();
    CharSequence _compile_1 = this.compile(_com);
    _builder.append(_compile_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    _builder.append("write ");
    Output _out = f.getOut();
    CharSequence _compile_2 = this.compile(_out);
    _builder.append(_compile_2, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Input i) {
    StringConcatenation _builder = new StringConcatenation();
    String _var1 = i.getVar1();
    _builder.append(_var1, "");
    {
      EList<String> _var2 = i.getVar2();
      for(final String v : _var2) {
        _builder.append(", ");
        _builder.append(v, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Output o) {
    StringConcatenation _builder = new StringConcatenation();
    String _var1 = o.getVar1();
    _builder.append(_var1, "");
    {
      EList<String> _var2 = o.getVar2();
      for(final String v : _var2) {
        _builder.append(", ");
        _builder.append(v, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Commandes cos) {
    StringConcatenation _builder = new StringConcatenation();
    Commande _com1 = cos.getCom1();
    CharSequence _compile = this.compile(_com1);
    _builder.append(_compile, "");
    {
      EList<Commande> _com2 = cos.getCom2();
      for(final Commande v : _com2) {
        _builder.append(", ");
        CharSequence _compile_1 = this.compile(v);
        _builder.append(_compile_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Commande co) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _nop = co.getNop();
      boolean _notEquals = (!Objects.equal(_nop, null));
      if (_notEquals) {
        _builder.append("nop");
      }
    }
    _builder.append("\t");
    {
      AffectVar _affectVar = co.getAffectVar();
      boolean _notEquals_1 = (!Objects.equal(_affectVar, null));
      if (_notEquals_1) {
        AffectVar _affectVar_1 = co.getAffectVar();
        CharSequence _compile = this.compile(_affectVar_1);
        _builder.append(_compile, "");
      }
    }
    {
      While _whileC = co.getWhileC();
      boolean _notEquals_2 = (!Objects.equal(_whileC, null));
      if (_notEquals_2) {
        While _whileC_1 = co.getWhileC();
        CharSequence _compile_1 = this.compile(_whileC_1);
        _builder.append(_compile_1, "");
      }
    }
    {
      For _forC = co.getForC();
      boolean _notEquals_3 = (!Objects.equal(_forC, null));
      if (_notEquals_3) {
        While _whileC_2 = co.getWhileC();
        CharSequence _compile_2 = this.compile(_whileC_2);
        _builder.append(_compile_2, "");
      }
    }
    {
      If _ifC = co.getIfC();
      boolean _notEquals_4 = (!Objects.equal(_ifC, null));
      if (_notEquals_4) {
        While _whileC_3 = co.getWhileC();
        CharSequence _compile_3 = this.compile(_whileC_3);
        _builder.append(_compile_3, "");
      }
    }
    {
      Foreach _foreachC = co.getForeachC();
      boolean _notEquals_5 = (!Objects.equal(_foreachC, null));
      if (_notEquals_5) {
        While _whileC_4 = co.getWhileC();
        CharSequence _compile_4 = this.compile(_whileC_4);
        _builder.append(_compile_4, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final While w) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final AffectVar av) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("afgect");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final For f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final If ifc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Foreach fe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("foreach");
    _builder.newLine();
    return _builder;
  }
}
