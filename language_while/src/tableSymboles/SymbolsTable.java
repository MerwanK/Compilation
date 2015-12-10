package tableSymboles;


import java.util.HashMap;

public class SymbolsTable {

	/**
	 * Attributes
	 */

	private HashMap<String, ParamVarFunction> tableFunctions; 	// Une map avec pour clé le nom de la fonction 
	// et pour valeur un ensemble d'infos la concernant (cf. classe ParamVarFunction).

	private HashMap<String, String> tableSymbols; 	// Une map avec pour clé le nom de la fonction associée à cette table des symboles 
	// et pour valeur une autre map avec pour clé cette fois le nom du symbole et pour valeur ce que vaut ce symbole.

	private int compteur;
	/**
	 * Constructor
	 */

	public SymbolsTable(){
		tableFunctions = new HashMap<String, ParamVarFunction>();
		tableSymbols = new HashMap<String, String>();
		compteur = 0;
	}

	/**
	 * 
	 * @param nameFunction
	 */

	public void putFunction(String nameFunction){
		ParamVarFunction infosFunc = new ParamVarFunction();
		tableFunctions.put(nameFunction, infosFunc);
	}

	public void setVariable(String fonct, String nameVarLocal){
		tableFunctions.get(fonct).setLocalVars(nameVarLocal);
	}

	public void setInVariable(String fonct, String nameVarLocal){
		tableFunctions.get(fonct).setInLocalVars(nameVarLocal);
	}

	public void setOutVariable(String fonct, String nameVarLocal){
		tableFunctions.get(fonct).setOutLocalVars(nameVarLocal);
	}

	/**
	 * 
	 * @param nameFunction
	 * @param nbIn
	 * @param nbOut
	 */
	/*
	public void putFunction(String nameFunction, int nbIn, int nbOut){
		ParamVarFunction infosFunc = new ParamVarFunction(nbIn, nbOut);
		tableFunctions.put(nameFunction, infosFunc);
	}
	 */
	/**
	 * 
	 * @param nameFunction
	 * @return
	 */

	public ParamVarFunction getFunction (String nameFunction){
		return tableFunctions.get(nameFunction);
	}

	// A voir si nécessaire de pouvoir changer de nom de fonction ?? (pareil pour var et symb)

	/**
	 * 
	 * @param nameFunction
	 * @param nameSymb
	 * @param value
	 */

	public void setSymbol(String nameSymbol){
		if(!tableSymbols.containsKey(nameSymbol)){
			tableSymbols.put(nameSymbol, "sym" + compteur);
			compteur++;
		}
	}


	/**
	 * 
	 * @param nameFunction
	 * @return
	 */

	/*
	public HashMap<String, String> getSymbols (String nameFunction){
		return tableSymbols.get(nameFunction);
	}
	 */
	/**
	 * Methode toString()
	 */

	public String toString() {
		String res = "";
		res = tableFunctions.toString()+ "\n" + tableSymbols.toString() ;
		return res;
	}



}
