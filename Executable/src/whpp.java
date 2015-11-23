import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class whpp {

	public static void main(String[] args) throws FileNotFoundException {
		String pathHelp = "";
		String fichierSource = args[0];
		String fichierDest = fichierSource + "pp";

		int defaut = 2;
		int indWhile = defaut;
		int indFor = defaut;
		int indForeach = defaut;
		int indIf = defaut;

		if (args[1].equals("-help")){
			Scanner scanner=new Scanner(new File(pathHelp));
			while (scanner.hasNextLine()) {
			    String line = scanner.nextLine();
			    System.out.println(line);
			}
			scanner.close();
		}
		
		for (int param=1;param<args.length;param++){
			if (args[param].equals("-all")){
				defaut = Integer.parseInt(args[param+1]); 
				indWhile = defaut;
				indFor = defaut;
				indForeach = defaut;
				indIf = defaut;
			}
			if (args[param].equals("-while"))
				indWhile = Integer.parseInt(args[param+1]); 
			if (args[param].equals("-for"))
				indFor = Integer.parseInt(args[param+1]);
			if (args[param].equals("-foreach"))
				indForeach = Integer.parseInt(args[param+1]);
			if (args[param].equals("-if"))
				indIf = Integer.parseInt(args[param+1]);
			if (args[param].equals("-o"))
				fichierDest = args[param+1];
		}
		
	}

}
