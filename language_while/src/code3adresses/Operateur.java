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
	
	public Operateur(String op, String nomOp,CodeGenere codeG){
		operateur = op;
		nom = nomOp;
		codeGenere = codeG;
	}
	
	public void addCodeGenere(CodeGenere cg){
		codeGenere = cg; 
	}
	
	public String getOperateur(){
		return operateur;
	}
	
	public String getNom(){
		return nom;
	}
	
	public CodeGenere getCodeGenere(){
		return codeGenere;
	}
	
	public String toString(){
		String res = "";
		if(codeGenere != null)
			res = "(" + operateur + ", " + nom + ")\n"+ "sous_code:\n"+codeGenere.toString();
		else
			res = "(" + operateur + ",_,_" + ")";
		
		return res;
	}

}
