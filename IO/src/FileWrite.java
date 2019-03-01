

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite
{
	public static void main(String args[]) 
	{
		FileReader fd=null;
		FileWriter fw=null;
	 try 
	  {
	    fd = new FileReader("C:/Users/760838/workspace/fileproject/output.txt");
		fw= new FileWriter("C:/Users/760838/workspace/fileproject/out.txt");
		int c;
		while((c=fd.read()) !=-1)
				{
			        fw.write(c);
				}
		fw.flush();
		/*while((c=fw.read()) !=-1)
		{
			
		}*/
		} 
	 catch (IOException e) 
	 {
			e.printStackTrace();
	  }
	}
 }
