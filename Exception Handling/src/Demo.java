
public class Demo {

	public static void main(String[] args)
	{
		int a=5;
		int b=0;
		int c=0;
		System.out.println("Going to divide");
		
		System.out.println("Answer: "+c);
		try
		{
			c=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Occured");
			b=1;
			
			c=a/b;
			System.out.println("problem Fixed");
			
		}
		System.out.println("Answer: "+c);
	}
}

