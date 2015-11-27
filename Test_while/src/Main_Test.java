import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Main_Test {

	public static void main(String[] args) throws IOException
	{
	List<String> correcthash = new ArrayList<String>();
	List<String> correctfilename = new ArrayList<String>();
	List<String> testhash = new ArrayList<String>();
	List<String> testfilename = new ArrayList<String>();
	int i = 0;
	int j = 0;
	
	Files.walk(Paths.get(System.getProperty("user.dir"),"Correct")).forEach(filePath -> 
	{
	    if (Files.isRegularFile(filePath))
	    {
	    	try 
	    	{
				correcthash.add(checkSum(filePath.toString()));
				correctfilename.add(filePath.getFileName().toString());
			} 
	    	catch (Exception e) 
	    	{

			}
	    	
	        //System.out.println(filePath);
	        //System.out.println(correcthash.get(0));
	    }
	});
		
	Files.walk(Paths.get(System.getProperty("user.dir"),"Test_files")).forEach(filePath -> 
	{
	    if (Files.isRegularFile(filePath)) 
	    {
	    	try 
	    	{
				testhash.add(checkSum(filePath.toString()));
				testfilename.add(filePath.getFileName().toString());
			} 
	    	catch (Exception e) 
	    	{
	    		
			}
	        //System.out.println(filePath);
	        //System.out.println(testhash.get(0));

	    }
	});
	
	while( i < correcthash.size())
	{
		while( j < testhash.size())
		{
			if (correcthash.get(i).equals(testhash.get(j)))
			{
				System.out.print("OK :  ");
				System.out.print(correctfilename.get(i));
				System.out.print("  ->  ");
				System.out.print(testfilename.get(j));
				System.out.print("\n");
				j = testhash.size();
			}
			else
			{
				j++;
			}
		}
		i++;
		j = 0;
	}
}
	
    public static String checkSum(String path) throws IOException, NoSuchAlgorithmException
    {
        String checksum = null;
        FileInputStream fis = new FileInputStream(path);
        MessageDigest md = MessageDigest.getInstance("MD5");
          
        byte[] buffer = new byte[8192];
        int numOfBytesRead;
            
        while((numOfBytesRead = fis.read(buffer))!= -1 )
        {
            md.update(buffer, 0, numOfBytesRead);
        }
        byte[] hash = md.digest();
        checksum = new BigInteger(1, hash).toString(16); //don't use this, truncates leading zero
        
        fis.close();
        return checksum;
    }



}
