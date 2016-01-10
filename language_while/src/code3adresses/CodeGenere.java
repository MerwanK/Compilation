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
	
	//Permet d'ajouter les nop
	public void addNop(){
		Quadruplet elem = new Quadruplet(new Operateur("nop"),"","","");
		listQuadruplet.add(elem);
	}	

	//Permet d'ajouter le quadruplet d'un read
	public void addRead(String elemRead){
		Quadruplet elem = new Quadruplet(new Operateur("read"),elemRead,"","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un write
	public void addWrite(String elemWrite){
		Quadruplet elem = new Quadruplet(new Operateur("write"),"",elemWrite,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'une affectation
	public void addAff(String elemG, String elemD){
		Quadruplet elem = new Quadruplet(new Operateur("Aff"),elemG,elemD,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un while
	public void addWhile(String cond){
		Quadruplet elem = new Quadruplet(new Operateur("while",cond),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un for
	public void addFor(String cond){
		Quadruplet elem = new Quadruplet(new Operateur("for",cond),"","","");
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
	public void addIf(String cond){
		Quadruplet elem = new Quadruplet(new Operateur("if"),"","","");
		listQuadruplet.add(elem);
	}	
	
	public String toString(){
		return listQuadruplet.toString();
	}

}
