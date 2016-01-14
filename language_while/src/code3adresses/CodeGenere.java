package code3adresses;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CodeGenere {

	//Attribut
	private List<Quadruplet> listQuadruplet;

	//Constructeur : Intialise la liste de quadruplet vide
	public CodeGenere(){
		listQuadruplet = new ArrayList<Quadruplet>();
	}

	public List<Quadruplet> getListQuadruplet(){
		return listQuadruplet;
	}

	public void addFonction(String nomFonction,CodeGenere codeG){
		Quadruplet elem = new Quadruplet(new Operateur("fonction",nomFonction,codeG),"","","");
		listQuadruplet.add(elem);
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
		Quadruplet elem = new Quadruplet(new Operateur("aff"),elemG,elemD,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un while
	public void addWhile(String cond, CodeGenere codeG){
		Quadruplet elem = new Quadruplet(new Operateur("while",cond,codeG),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un for
	public void addFor(String cond, CodeGenere codeG){
		Quadruplet elem = new Quadruplet(new Operateur("for",cond,codeG),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un foreach
	public void addForeach(String cond, CodeGenere codeG){
		Quadruplet elem = new Quadruplet(new Operateur("foreach",cond,codeG),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un if
	public void addIf(String cond, CodeGenere codeG){
		Quadruplet elem = new Quadruplet(new Operateur("if",cond,codeG),"","","");
		listQuadruplet.add(elem);
	}	

	//Permet d'ajouter le quadruplet d'un else
	public void addElse(CodeGenere codeG){
		Quadruplet elem = new Quadruplet(new Operateur("else","",codeG),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un expr
	public void addExpr(CodeGenere codeG, String registre){
		Quadruplet elem = new Quadruplet(new Operateur("expr","",codeG),registre,"","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un nil
	public void addNil(){
		Quadruplet elem = new Quadruplet(new Operateur("nil"),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un Var
	public void addVariable(String nomVar){
		Quadruplet elem = new Quadruplet(new Operateur("var"),"",nomVar,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un Sym
	public void addSymbole(String nomSym){
		Quadruplet elem = new Quadruplet(new Operateur("sym"),"",nomSym,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un Cons
	public void addCons(CodeGenere code){
		Quadruplet elem = new Quadruplet(new Operateur("cons","",code),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un list
	public void addList(CodeGenere code){
		Quadruplet elem = new Quadruplet(new Operateur("list","",code),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un head
	public void addHead(CodeGenere code){
		Quadruplet elem = new Quadruplet(new Operateur("hd","",code),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un tail
	public void addTail(CodeGenere code){
		Quadruplet elem = new Quadruplet(new Operateur("tl","",code),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un call
	public void addCall(CodeGenere code, String nomFonction){
		Quadruplet elem = new Quadruplet(new Operateur("call","",code),"",nomFonction,"");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un égalité
	public void addEq(CodeGenere code){
		Quadruplet elem = new Quadruplet(new Operateur("eq","",code),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un and
	public void addAnd(CodeGenere code){
		Quadruplet elem = new Quadruplet(new Operateur("and","",code),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un or
	public void addOr(CodeGenere code){
		Quadruplet elem = new Quadruplet(new Operateur("or","",code),"","","");
		listQuadruplet.add(elem);
	}

	//Permet d'ajouter le quadruplet d'un not
	public void addNot(CodeGenere code){
		Quadruplet elem = new Quadruplet(new Operateur("not","",code),"","","");
		listQuadruplet.add(elem);
	}

	public String toString(){
		String res = "";
		Iterator<Quadruplet> it = listQuadruplet.iterator();
		while(it.hasNext()){
			res = res + it.next().toString() + "\n";
		}
		return res;
	}

}
