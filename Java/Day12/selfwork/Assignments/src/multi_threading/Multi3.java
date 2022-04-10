package multi_threading;

public class Multi3 implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i = 0; i <= 5; i++)
			{
				System.out.println("Exec "+i);
			}
		}
	}
	public static void main(String[] args) 
	{
		Multi3 m1 = new Multi3();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		Thread t3 = new Thread(m1);
		t1.start();
		t2.start();
		t3.start();
	}
}
