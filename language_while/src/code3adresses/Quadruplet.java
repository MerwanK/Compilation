package code3adresses;

public class Quadruplet {
	 
	private Operateur operateur;
	private String element1;
	private String element2;
	private String element3;
	
	public Quadruplet(Operateur op, String elem1, String elem2, String elem3){
		operateur = op;
		element1  = elem1;
		element2  = elem2;
		element3  = elem3;
	}
	
	public void addCodeGenere(CodeGenere cg){
		operateur.addCodeGenere(cg);
	}
	
	public String toString(){
		String res = "";
		res = "<" + operateur.toString() + ", " + element1 + ", " + element2 + ", " + element3 + ">";
		return res;
	}
	
	
	
	
}
