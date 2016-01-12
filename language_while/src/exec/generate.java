package exec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.example.mydsl.generator.MyDslGenerator;
import backEnd.TroisAddVersPython;


public class generate 
{

	public static void main(String[] args) throws IOException 
	{
		String pathHelp = "src/whpp_help.txt";
		//String fichierSource = args[0];
		String fichierSource = "src/exec/Test1.wh";
		String fichierDest = fichierSource.replaceAll(".wh",".py");
		
		System.out.println(fichierSource);
		System.out.println(fichierDest);
		
		PrintStream output = new PrintStream(new File(fichierDest));
		
		try (BufferedReader br = new BufferedReader(new FileReader(fichierSource))) 
		{
			String line = null;
			while ((line = br.readLine()) != null) 
			{
			    System.out.println(line);
			}
		br.close();	
		}
		

		/*if ( args.length==0 || (args[0].equals("-help")) )
		{
			Scanner scanner=new Scanner(new File("src/exec/whpp_help.txt"));
			while (scanner.hasNextLine()) 
			{
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		}
		
		else*/
		{
			MyDslGenerator generator = new MyDslGenerator();
			generator.generationCode3Adresses(fichierSource);
			output.print("import BinTrees \n");
			output.print(TroisAddVersPython.codePython(generator.getCodeGenere(), generator.getTableSymbole()));
		}
	}
	
}
