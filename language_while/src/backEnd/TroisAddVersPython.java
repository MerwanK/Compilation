package backEnd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import code3adresses.CodeGenere;
import code3adresses.Quadruplet;
import tableSymboles.ParamVarFunction;
import tableSymboles.SymbolsTable;

public class TroisAddVersPython {
	public static String codePython(CodeGenere code, SymbolsTable tableSymboles){
		int niveau = 0;
		String nomFonction = "";
		return codePython(code,tableSymboles,niveau,nomFonction,0);
	}

	public static String codePython(CodeGenere code, SymbolsTable tableSymboles, int niveau, String nomFonction, int compteurFor){

		String res = "";
		String nomF = nomFonction;
		List<Quadruplet> currentList = code.getListQuadruplet();
		Iterator<Quadruplet> it = currentList.iterator(); 

		while(it.hasNext()){
			Quadruplet currentQuadruplet = it.next();
			if(currentQuadruplet.getOperateur().getOperateur()=="fonction"){
				nomF = currentQuadruplet.getOperateur().getNom();
			}
			if(currentQuadruplet.getOperateur().getOperateur()=="expr"){
				res += currentQuadruplet.getElement1() + " = " + traducteurExpr(currentQuadruplet.getOperateur().getCodeGenere().getListQuadruplet().get(0),nomFonction,tableSymboles) + "\n";
			}
			else {
				if(currentQuadruplet.getOperateur().getOperateur()=="call"){
					traducteurCall(currentQuadruplet,nomF,tableSymboles);
				}
				else{
					res += traducteur(currentQuadruplet,tableSymboles,nomF,compteurFor);
					if(currentQuadruplet.getOperateur().getOperateur()=="for")
						compteurFor++;
					if(currentQuadruplet.isSousCode()){

						res += indent(codePython(currentQuadruplet.getOperateur().getCodeGenere(),tableSymboles,niveau+1,nomF,compteurFor));
					}
				}
			}
		}
		return res;
	}

	public static String traducteur(Quadruplet quadruplet, SymbolsTable table, String nomFonction, int compteurFor){// faire le lien avec la table de symobole
		String res = "";

		switch (quadruplet.getOperateur().getOperateur()) 
		{ 
		case "fonction"	: 
			List<Quadruplet> listQuadruplet = quadruplet.getOperateur().getCodeGenere().getListQuadruplet(); 
			List<String> listParam = new ArrayList<String>();
			res += "\ndef ";
			res += nomFonction +"(";
			Iterator<Quadruplet> it = listQuadruplet.iterator();
			Quadruplet currentQuadruplet = it.next();	
			while(currentQuadruplet.getOperateur().getOperateur()=="read"){
				listParam.add(currentQuadruplet.getElement1()); 
				res += traducteurVar(currentQuadruplet.getElement1(),nomFonction,table);
				Quadruplet nextQuadruplet = it.next();	
				if (nextQuadruplet.getOperateur().getOperateur()=="read"){
					res +=", ";
				}
				currentQuadruplet = nextQuadruplet;
			}
			res += "):\n";
			res +=initVarLocal(nomFonction, listParam, table);
			break; 

		case "write"	: 
			res = "return " + traducteurVar(quadruplet.getElement2(), nomFonction, table) + "\n";
			break;

		case "nop"		: 
			res = "pass\n";
			break; 

		case "aff"		: 
			res = traducteurVar(quadruplet.getElement1(), nomFonction, table) + " = " + traducteurVar(quadruplet.getElement2(), nomFonction, table) + "\n";
			break;

		case "while"	: 
			res = "while " + quadruplet.getOperateur().getNom() + ".isNotNil()" +":\n";
			break;

		case "for"		: 
			res = "for i"+compteurFor+ " in range(0, " + quadruplet.getOperateur().getNom() + ".countFor()):\n";
			break;

		case "if"		:
			res = "if " + quadruplet.getOperateur().getNom() + ".isNotNil():\n";
			break;

		case "else"		:
			res = "else:\n";
			break;

		default			: 
			break;
		}
		return res;
	}

	public static String traducteurVar(String var, String nomFonction, SymbolsTable table){
		String varPython = "";
		char firstChar = var.charAt(0);
		if(firstChar >= 'a' && firstChar <= 'z')
			varPython = table.getVarGlobal(var);
		else 
			varPython = table.getVarLocal(var, nomFonction);
		return varPython;
	}

	public static String traducteurExpr(Quadruplet quadruplet, String nomFonction, SymbolsTable table){	
		String res = "";

		switch (quadruplet.getOperateur().getOperateur()) 
		{ 
		case "var"	   : 
			res = traducteurVar(quadruplet.getElement2(),nomFonction,table);
			break; 

		case "sym"	   : 
			res = traducteurVar(quadruplet.getElement2(), nomFonction, table);
			break;

		case "nil"	   : 
			res = "BinTrees.BinTrees()";
			break;

		case "cons"   : 
			List<Quadruplet> currentList = quadruplet.getOperateur().getCodeGenere().getListQuadruplet();
			Iterator<Quadruplet> it = currentList.iterator(); 

			Quadruplet currentQuadruplet = it.next();
			Quadruplet nextQuadruplet = it.next();
			while(it.hasNext()){
				res += "BinTrees.BinTrees(\"cons\", " + traducteurExpr(currentQuadruplet,nomFonction,table) + ", " ;
				currentQuadruplet = nextQuadruplet;
				nextQuadruplet = it.next();
			}
			res += "BinTrees.BinTrees(\"cons\", " + traducteurExpr(currentQuadruplet,nomFonction,table) + ", " + traducteurExpr(nextQuadruplet,nomFonction,table) + ")";
			int nbParenthese = quadruplet.getOperateur().getCodeGenere().getListQuadruplet().size() - 2;
			for(int i=0;i<nbParenthese;i++){
				res += ")";
			}
			break;

		case "list"   : 
			List<Quadruplet> currentList2 = quadruplet.getOperateur().getCodeGenere().getListQuadruplet();
			Iterator<Quadruplet> it2 = currentList2.iterator(); 

			Quadruplet currentQuadruplet2 = it2.next();
			Quadruplet nextQuadruplet2 = it2.next();
			while(it2.hasNext()){
				res += "BinTrees.BinTrees(\"cons\", " + traducteurExpr(currentQuadruplet2,nomFonction,table) + ", " ;
				currentQuadruplet2 = nextQuadruplet2;
				nextQuadruplet2 = it2.next();
			}
			res += "BinTrees.BinTrees(\"cons\", " + traducteurExpr(currentQuadruplet2,nomFonction,table) + ", " + "BinTrees.BinTrees(\"cons\", " + traducteurExpr(nextQuadruplet2,nomFonction,table) + ", " + "BinTrees.BinTrees()))";
			int nbParenthese2 = quadruplet.getOperateur().getCodeGenere().getListQuadruplet().size() - 2;
			for(int i=0;i<nbParenthese2;i++){
				res += ")";
			}
			break;

		case "tl"   : 
			res = traducteurExpr(quadruplet.getOperateur().getCodeGenere().getListQuadruplet().get(0),nomFonction,table) + ".getLeftChild()";
			break;

		case "hd"   : 
			res = traducteurExpr(quadruplet.getOperateur().getCodeGenere().getListQuadruplet().get(0),nomFonction,table) + ".getRightChild()";
			break;
			
		case "call"  :
			res = traducteurCall(quadruplet, nomFonction, table);
		default		   : 
			break;
		}
		return res;
	}
	
	public static String traducteurCall(Quadruplet quadruplet, String nomFonction, SymbolsTable table){	
		String res = "";
		ParamVarFunction tableFonction = table.getFunction(quadruplet.getElement2());
		CodeGenere codeCall = quadruplet.getOperateur().getCodeGenere();
		if(tableFonction!=null && tableFonction.getNbParamIn()==codeCall.getListQuadruplet().size() && tableFonction.getNbParamOut()==1 ){
			res += quadruplet.getElement2() + "(";
			
			Iterator<Quadruplet> it = codeCall.getListQuadruplet().iterator();	
			while(it.hasNext()){
				Quadruplet currentQuadruplet = it.next();
				res += traducteurExpr(currentQuadruplet.getOperateur().getCodeGenere().getListQuadruplet().get(0), nomFonction, table);
				if (it.hasNext()){
					res +=", ";
				}
			}
			res += ")";
		}
		else 
			res = "BinTrees.BinTrees()";
		return res;
	}

	public static String initVarLocal(String nomFonction, List<String> listParam, SymbolsTable table){

		String res = "";
		Set<String> listVarLocal = table.getFunction(nomFonction).getMapVarLocal().keySet();
		Iterator<String> it = listVarLocal.iterator();
		while(it.hasNext()){
			boolean estUnParam = false;
			String current = it.next();
			Iterator<String> it2 = listParam.iterator();
			while(it2.hasNext() && !estUnParam){
				String current2 = it2.next();
				if(current == current2)
					estUnParam = true;
			}
			if(!estUnParam){
				res += "\t" + traducteurVar(current, nomFonction, table) + " = BinTree.BinTree()" + "\n";
			}
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
