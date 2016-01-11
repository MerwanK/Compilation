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

	public Operateur getOperateur(){
		return operateur;
	}

	public String getElement1(){
		return element1;
	}

	public String getElement2(){
		return element2;
	}
	
	public String getElement3(){
		return element3;
	}

	public boolean isSousCode(){
		return operateur.isSousCode();
	}

	public String toString(){
		String res = "";
		res = "<" + operateur.toString() + ", " + element1 + ", " + element2 + ", " + element3 + ">";
		return res;
	}




}
