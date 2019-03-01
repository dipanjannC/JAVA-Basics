import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class DemoWrite {

	public static void main(String[] args)
	{
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("Input.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			Account acc=new Account(1234,"abra ka dabra",4524);
			oos.writeObject(acc);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
