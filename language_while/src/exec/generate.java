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
		String fichierSource = args[0];
		//String fichierSource = "src/exec/Test1.wh";
		String fichierDest = fichierSource.replaceAll(".wh",".py");
		int mainstart = 0;
		int mainbody = 0;
		int nbarg = 0;
		int inc = 0;
		
		String lastfunc =null;
		String tempcache = null;
		String cache1 = null;
		String cache2 = null;
		String cache3 = null;
		
		MyDslGenerator generator = new MyDslGenerator();
		
		LinkedHashMap<String, ParamVarFunction> temp = null;
		Entry<String, ParamVarFunction> tempentry = null;
		Iterator<Entry<String, ParamVarFunction>> it = null;
		
		//System.out.println(fichierSource);
		//System.out.println(fichierDest);
		
		PrintStream output = new PrintStream(new File(fichierDest));
		
		try (BufferedReader br = new BufferedReader(new FileReader(fichierSource))) 
		{
			String line = null;
			while ((line = br.readLine()) != null) 
			{
			    //System.out.println(line);
			}
		br.close();	
		}
		
		
		generator.generationCode3Adresses(fichierSource);
		tempcache = TroisAddVersPython.codePython(generator.getCodeGenere(), generator.getTableSymbole()).toString();
		temp = generator.getTableSymbole().getfuncmap();
		it = temp.entrySet().iterator();
			
		while(it.hasNext())
		{
			tempentry = it.next();
		}
			
		lastfunc = tempentry.getKey();
		
		mainstart = tempcache.lastIndexOf("def ", tempcache.length());
		mainbody = tempcache.lastIndexOf(":\n", tempcache.length());
		
		//System.out.println(mainstart);
		
		cache1 = tempcache.substring(0, mainstart);
		cache2 = tempcache.substring(mainstart, mainbody);
		cache3 = tempcache.substring(mainbody, tempcache.length());
		cache3 = cache3.replaceAll("return (.*)\n","BinTrees.printTree\\($1\\)\n"); //TODO
		
		nbarg = generator.getTableSymbole().getFunction(lastfunc).getNbParamIn();
			
		output.print("import BinTrees,os,sys \n\nnbarg = "+nbarg+"\n\nnarg = []\n\nfor index in range(len(sys.argv)-1):\n\tnarg.append(BinTrees.BinTrees.stringToTree(sys.argv[index]))\n\n");
		output.print("while(len(narg) < nbarg):\n\tnarg.append(BinTrees.BinTrees())\n");
		output.print(cache1);
		output.print(cache2);
		output.print(cache3);
		output.print("\nif __name__ == '__main__':\n\t"+lastfunc+"(");
		while (inc != nbarg)
		{
			output.print("narg["+inc+"]");
			inc++;
			if(inc!=nbarg)
			{
				output.print(", ");
			}
			else
			{
				output.print(")");
			}
		}
		
		output.close();
	}
	
}
