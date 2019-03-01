import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		
		try {
			FileReader fileStream =new FileReader("D:/codes/IO/Sample.txt");
			int ch;
			
			while((ch=fileStream.read())!=-1)
			{
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
