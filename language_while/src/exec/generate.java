package exec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.xtext.example.mydsl.generator.MyDslGenerator;
import backEnd.TroisAddVersPython;
import tableSymboles.ParamVarFunction;


public class generate 
{

	public static void main(String[] args) throws IOException 
	{
		//String fichierSource = args[0];
		String fichierSource = "src/exec/Test1.wh";
		String fichierDest = fichierSource.replaceAll(".wh",".py");
		int mainstart = 0;
		
		String cache1 = null;
		String cache2 = null;
		
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
		
		MyDslGenerator generator = new MyDslGenerator();
		generator.generationCode3Adresses(fichierSource);
		String tempcache = TroisAddVersPython.codePython(generator.getCodeGenere(), generator.getTableSymbole()).toString();
			
		LinkedHashMap<String, ParamVarFunction> temp = generator.getTableSymbole().getfuncmap();
		Entry<String, ParamVarFunction> tempentry = null;
		Iterator<Entry<String, ParamVarFunction>> it = temp.entrySet().iterator();
			
		while(it.hasNext())
		{
			tempentry = it.next();
		}
			
		String lastfunc = tempentry.getKey();
		
		mainstart = tempcache.lastIndexOf("def ", tempcache.length());
		
		System.out.println(mainstart);
		
		cache1 = tempcache.substring(0, mainstart);
		cache2 = tempcache.substring(mainstart, tempcache.length());
		cache2 = cache2.replaceAll("return","print");
			
		output.print("import BinTrees,os,sys \n\narg = []\nfor index in range(len(sys.argv)):\n\targ.append(translate(sys.argv[index]))\n");
		output.print(cache1);
		output.print(cache2);
		//output.print(tempcache.replaceAll("def "+lastfunc+" \\([a-z0-9]*\\) :", lastfunc+" :"));
		output.print("\nif __name__ == '__main__':\n\t"+lastfunc+"()");
		
			
			
	}
	
}
