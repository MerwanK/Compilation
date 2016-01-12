package backEnd;

import java.util.Iterator;
import java.util.List;
import code3adresses.CodeGenere;
import code3adresses.Quadruplet;
import tableSymboles.SymbolsTable;

public class TroisAddVersPython {

	public static void main (String [] arg){
		SymbolsTable table = new SymbolsTable();
		table.putFunction("f1");
		table.setInVariable("f1", "A");
		table.setInVariable("f1", "B");
		table.setOutVariable("f1", "B");
		table.putFunction("f2");
		table.setInVariable("f2", "A");
		table.setInVariable("f2", "B");
		table.setOutVariable("f2", "B");
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
		CodeGenere codeF1 = new CodeGenere();
		CodeGenere codeW0 = new CodeGenere();
		CodeGenere codeW11 = new CodeGenere();
		CodeGenere codeW22 = new CodeGenere();
		codeF1.addRead("A");
		codeF1.addRead("B");
		codeW22.addNop();
		codeW11.addWhile("expr",codeW2);
		codeW11.addNop();
		codeW0.addWhile("expr",codeW1);
		codeW0.addNop();
		codeF1.addWhile("expr",codeW);
		codeF1.addWrite("B");
		code.addFonction("f2", codeF);

		System.out.println(codePython(code,table));
	}

	public static String codePython(CodeGenere code, SymbolsTable tableSymboles){
		int niveau = 0;
		String nomFonction = "";
		return codePython(code,tableSymboles,niveau,nomFonction);
	}

	public static String codePython(CodeGenere code, SymbolsTable tableSymboles, int niveau, String nomFonction){

		String res = "";
		String nomF = nomFonction;
		List<Quadruplet> currentList = code.getListQuadruplet();
		Iterator<Quadruplet> it = currentList.iterator(); 

		while(it.hasNext()){
			Quadruplet currentQuadruplet = it.next();
			if(currentQuadruplet.getOperateur().getOperateur()=="fonction"){
				nomF = currentQuadruplet.getOperateur().getNom();
			}
			res += traducteur(currentQuadruplet,tableSymboles,nomF);

			if(currentQuadruplet.isSousCode()){

				res += indent(codePython(currentQuadruplet.getOperateur().getCodeGenere(),tableSymboles,niveau+1,nomF));
			}
		}
		return res;
	}

	public static String traducteur(Quadruplet quadruplet, SymbolsTable table, String nomFonction){// faire le lien avec la table de symobole
		String res = "";

		switch (quadruplet.getOperateur().getOperateur()) 
		{ 
		case "fonction": 
			List<Quadruplet> listQuadruplet = quadruplet.getOperateur().getCodeGenere().getListQuadruplet(); 
			res += "\ndef ";
			res += nomFonction +" (";
			Iterator<Quadruplet> it = listQuadruplet.iterator();
			Quadruplet currentQuadruplet = it.next();	
			while(currentQuadruplet.getOperateur().getOperateur()=="read"){
				res += traducteurVar(currentQuadruplet.getElement1(),nomFonction,table);
				Quadruplet nextQuadruplet = it.next();	
				if (nextQuadruplet.getOperateur().getOperateur()=="read"){
					res +=", ";
				}
				currentQuadruplet = nextQuadruplet;
			}
			res += ") :\n";
			break; 

		case "write"   : 
			res = "return " + traducteurVar(quadruplet.getElement2(), nomFonction, table) + "\n";
			break;

		case "nop"	   : 
			res = "pass\n";
			break; 

		case "aff"	   : 
			res = traducteurVar(quadruplet.getElement1(), nomFonction, table) + "=" + traducteurVar(quadruplet.getElement2(), nomFonction, table) + "\n";
			break;
			
		case "while"   : 
			res = "while expr\n";
			break;

		default		   : 
			break;
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

	public static String traducteurVar(String varWhile, String nomFonction, SymbolsTable table){
		String varPython = "";
		char firstChar = varWhile.charAt(0);
		if(firstChar >= 'a' && firstChar <= 'z')
			varPython = table.getVarGlobal(varWhile);
		else 
			varPython = table.getVarLocal(varWhile, nomFonction);
		return varPython;
	}
}
