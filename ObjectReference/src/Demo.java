
public class Demo {

	public static void main(String[] args)
	{
		int option=1;
		Exhibition exhibit=new Exhibition();
		
		if(option==1)
		{
			Cat c1=new Cat();
			exhibit.display(c1);
		}
		else
		{
			Snake s1=new Snake();
			exhibit.display(s1);
		}
	}
}
