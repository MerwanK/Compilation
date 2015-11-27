package executable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.example.mydsl.generator.MyDslGenerator;


public class whpp {

	public static void main(String[] args) throws FileNotFoundException {
		String pathHelp = "Document\\whpp_help.txt";
		String fichierSource = args[0];
		String fichierDest = fichierSource + "pp";

		int indDefault = 2;
		int indWhile = indDefault;
		int indFor = indDefault;
		int indForeach = indDefault;
		int indIf = indDefault;

		if (args[0].equals("-help")){
			Scanner scanner=new Scanner(new File(pathHelp));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		}
		else{
			for (int param=1;param<args.length;param++){
				if (args[param].equals("-all")){
					indDefault = Integer.parseInt(args[param+1]); 
					indWhile = indDefault;
					indFor = indDefault;
					indForeach = indDefault;
					indIf = indDefault;
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
			MyDslGenerator generator = new MyDslGenerator();
			generator.generationDuPrettyPrinter(fichierSource, fichierDest, indIf, indWhile, indForeach, indForeach);
		}
	}
}