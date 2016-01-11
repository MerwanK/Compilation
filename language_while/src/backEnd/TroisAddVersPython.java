package backEnd;

import java.util.Iterator;
import java.util.List;

import org.eclipse.xtext.xbase.scoping.batch.ConstructorDelegateScope;

import code3adresses.CodeGenere;
import code3adresses.Quadruplet;

public class TroisAddVersPython {

	public static void main (String [] arg){
		CodeGenere code = new CodeGenere();
		CodeGenere codeF = new CodeGenere();
		codeF.addRead("A");
		codeF.addNop();
		codeF.addWrite("B");
		code.addFonction("f1", codeF);
		
		System.out.println(codePython(code));
	}

	public static String codePython(CodeGenere code){
		int niveau = 0;
		return codePython(code,niveau);
	}

	public static String codePython(CodeGenere code, int niveau){

		String res = "";
		List<Quadruplet> currentList = code.getListQuadruplet();
		Iterator<Quadruplet> it = currentList.iterator(); 

		while(it.hasNext()){
			Quadruplet currentQuadruplet = it.next();
			res += traducteur(currentQuadruplet);

			if(currentQuadruplet.isSousCode()){
				res += codePython(currentQuadruplet.getOperateur().getCodeGenere(),niveau+1);
			}
		}
		return indent(res,niveau);
	}

	public static String traducteur(Quadruplet quadruplet){// faire le lien avec la table de symobole
		switch (quadruplet.getOperateur().getOperateur()) 
		{ 
		case "fonction": return "fonction f1\n"; 
		case "read"    : return "read a";
		case "write"   : return "write b";
		case "nop"	   : return "pass"; 
		default		   : return "erreur quadruplet inexistant ";
		}

	}

	public static String indent(String code, int niveau){
		String res = "\t";
		int i;
		while(niveau!=0){
			i=0;
			while (i < code.length()){
				char current = code.charAt(i);
				res += current;
				if(current == 10)
					res += "\t";
				i++;
			}
			niveau--;
		}
		return res;
	}
}
