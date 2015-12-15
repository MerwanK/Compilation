package code3adresses;
import java.util.List;
import java.util.ArrayList;

public class CodeGenere {

	//Attribut
	private List<Quadruplet> listQuadruplet;

	//Constructeur : Intialise la liste de quadruplet vide
	public CodeGenere(){
		listQuadruplet = new ArrayList<Quadruplet>();
	}

	//Permet de créer un label
	public void quadrupletLabel(String label){
		Quadruplet qlabel = new Quadruplet(label,"","","");
		listQuadruplet.add(qlabel);
	}
	
	//Permet de creer le goto
	public void addGoto(String label){
		Quadruplet elemGoto = new Quadruplet("goto","",label,"");
		listQuadruplet.add(elemGoto);
	}

	//Permet d'ajouter le quadruplet d'un read
	public void addRead(String elemRead){
		Quadruplet elem = new Quadruplet("read","",elemRead,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un write
	public void addWrite(String elemWrite){
		Quadruplet elem = new Quadruplet("write","",elemWrite,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'une affectation
	public void addAff(String elemG, String elemD){
		Quadruplet elem = new Quadruplet("aff",elemG,elemD,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un while
	public void addWhile(String cond,String label){
		Quadruplet elem = new Quadruplet("while "+cond,"",label,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un for
	public void addFor(String cond,String label){
		Quadruplet elem = new Quadruplet("for "+cond,"",label,"");
		listQuadruplet.add(elem);
	}

	/*
	//Permet d'ajouter le quadruplet d'un foreach
	public void addForeach(String cond,String label1, String label2){
		Quadruplet elem = new Quadruplet("foreach",cond,label1,label2);
		listQuadruplet.add(elem);
	}
	 */

	//Permet d'ajouter le quadruplet d'un for
	public void addIf(String cond,String label1, String label2){
		Quadruplet elem = new Quadruplet("if "+cond,"",label1,label2);
		listQuadruplet.add(elem);
	}	
	
	public String toString(){
		return listQuadruplet.toString();
	}

}
