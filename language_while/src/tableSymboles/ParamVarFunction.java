package tableSymboles;


import java.util.HashMap;
import java.util.LinkedHashMap;

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
		LocalVars = new LinkedHashMap<String, String>();
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
	
	public HashMap<String,String> getMapVarLocal(){
		return LocalVars;
	}

	/**
	 * 
	 * @param nameVarLocal
	 * @param value
	 */
	
	public void setInLocalVars(String nameVarLocal) {
		if(!LocalVars.containsKey(nameVarLocal)){
			LocalVars.put(nameVarLocal, "var" + compteur);
			compteur++;
		}
		nbParamIn++;
	}
	
	public void setOutLocalVars(String nameVarLocal) {
		if(!LocalVars.containsKey(nameVarLocal)){
			LocalVars.put(nameVarLocal, "var" + compteur);
			compteur++;
		}
		nbParamOut++;
	}
	
	public void setLocalVars(String nameVarLocal) {
		if(!LocalVars.containsKey(nameVarLocal)){
			LocalVars.put(nameVarLocal, "var" + compteur);
			compteur++;
		}
	}
	
	/**
	 * 
	 */
	
	public String toString() {
		return " [nbInputs =" + nbParamIn + ", nbOutputs =" + nbParamOut + ", Liste des variables locales =" + LocalVars + "]\n";
	}
	
	
}