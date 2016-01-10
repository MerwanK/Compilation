package code3adresses;

public class Operateur {
	
	private String operateur;
	private String nom;
	private CodeGenere codeGenere;
	
	public Operateur(String op){
		operateur = op;
		nom = null;
		codeGenere = null;
	}
	
	public Operateur(String op, String nomOp){
		operateur = op;
		nom = nomOp;
		codeGenere = new CodeGenere();
	}
	
	public void addCodeGenere(CodeGenere cg){
		codeGenere = cg; 
	}
	
	public String toString(){
		String res = "";
		res = "<" + operateur + ", " + nom + ", " + codeGenere.toString() + ">";
		return res;
	}

}
