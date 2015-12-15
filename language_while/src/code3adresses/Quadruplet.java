package code3adresses;

public class Quadruplet {
	 
	private String operateur;
	private String element1;
	private String element2;
	private String element3;
	
	public Quadruplet(String op, String elem1, String elem2, String elem3){
		operateur = op;
		element1  = elem1;
		element2  = elem2;
		element3  = elem3;
	}
	
	public String toString(){
		String res = "";
		res = "<" + operateur + ", " + element1 + ", " + element2 + ", " + element3 + ">\n";
		return res;
	}
	
	
	
	
}
