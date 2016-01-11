package backEnd;

import java.util.Iterator;
import java.util.List;
import code3adresses.CodeGenere;
import code3adresses.Quadruplet;

public class TroisAddVersPython {

	public static void main (String [] arg){
		CodeGenere code = new CodeGenere();
		CodeGenere codeF = new CodeGenere();
		CodeGenere codeW = new CodeGenere();
		CodeGenere codeW1 = new CodeGenere();
		CodeGenere codeW2 = new CodeGenere();
		codeF.addRead("A");
		codeF.addRead("B");
		codeW2.addNop();
		codeW1.addWhile("expr",codeW2);
		codeW1.addNop();
		codeW.addWhile("expr",codeW1);
		codeW.addNop();
		codeF.addWhile("expr",codeW);
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
				res += indent(codePython(currentQuadruplet.getOperateur().getCodeGenere(),niveau+1));
			}
		}
		return res;
	}

	public static String traducteur(Quadruplet quadruplet){// faire le lien avec la table de symobole
		String res = "";
		
		switch (quadruplet.getOperateur().getOperateur()) 
		{ 
		case "fonction": List<Quadruplet> listQuadruplet = quadruplet.getOperateur().getCodeGenere().getListQuadruplet(); 
						 res += "def ";
						 res += "fonction1 (";
						 Iterator<Quadruplet> it = listQuadruplet.iterator();
						 Quadruplet currentQuadruplet = it.next();	
						 while(currentQuadruplet.getOperateur().getOperateur()=="read"){
							res += "ArbreBin " +currentQuadruplet.getElement1();
							Quadruplet nextQuadruplet = it.next();	
							if (nextQuadruplet.getOperateur().getOperateur()=="read"){
								res +=", ";
							}
							currentQuadruplet = nextQuadruplet;
						 }
						 res += ") :\n";break; 
		case "write"   : res = "return b\n";break;
		case "nop"	   : res = "pass\n";break; 
		case "while"   : res = "while expr\n";break;
		
		default		   : break;
		}
		return res;
	}

	public static String indent(String code){
		String res = "\t";
		int i=0;
		while (i < code.length()-1){
			char current = code.charAt(i);
			char next = code.charAt(i+1);
			res += current;
			if(current == 10 && next!=0)
				res += "\t";
			i++;
		}
		return res + "\n";
	}
}
