package tableSymboles;


import java.util.HashMap;

public class ParamVarFunction {

	private int nbParamIn;
	private int nbParamOut;
	private int compteur;
	private HashMap<String, String> LocalVars;
	
	/*
	public ParamVarFunction(int nbIn, int nbOut){
		nbParamIn = nbIn;
		nbParamOut = nbOut;
		LocalVars = new HashMap<String, String>(); 
	}
	*/
	
	public ParamVarFunction(){
		nbParamIn = 0;
		nbParamOut = 0;
		compteur = 0;
		LocalVars = new HashMap<String, String>();
	}

	/**
	 * @return the nbParamIn
	 */
	public int getNbParamIn() {
		return nbParamIn;
	}

	/**
	 * @return the nbParamOut
	 */
	public int getNbParamOut() {
		return nbParamOut;
	}

	/**
	 * @return the localVars
	 */
	public String getValueLocalVars(String nameVarLocal){
		return LocalVars.get(nameVarLocal);
	}

	/**
	 * 
	 * @param nameVarLocal
	 * @param value
	 */
	
	public void setInLocalVars(String nameVarLocal) {
		if(!LocalVars.containsKey(nameVarLocal)){
			LocalVars.put(nameVarLocal, "var" + compteur);
			nbParamIn++;
			compteur++;
		}
	}
	
	public void setOutLocalVars(String nameVarLocal) {
		if(!LocalVars.containsKey(nameVarLocal)){
			LocalVars.put(nameVarLocal, "var" + compteur);
			nbParamOut++;
			compteur++;
		}
	}
	
	/**
	 * 
	 */
	
	public String toString() {
		return "Table des fonctions : [nbInputs =" + nbParamIn + ", nbOutputs =" + nbParamOut + ", Liste des variables locales =" + LocalVars + "]";
	}
	
	
}