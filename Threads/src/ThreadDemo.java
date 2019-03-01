
public class ThreadDemo extends Thread{
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(getName()+" : "+i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
