
public class Main {
	
	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		ThreadDemo td1=new ThreadDemo();
		
		td1.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println(t.getName()+" : "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
