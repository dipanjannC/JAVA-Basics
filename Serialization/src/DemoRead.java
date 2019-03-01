import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoRead {

	public static void main(String[] args)
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("Input.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Account account=(Account)ois.readObject();
			System.out.println(account.getAccNo());
			System.out.println(account.getName());
			System.out.println(account.getAtmPin());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
