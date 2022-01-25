package multi_threading;

import java.util.concurrent.*;

public class ClassLock2 implements Runnable
{
	public void run()
	{
		disp();
	}
	void disp()
	{
		for(int i = 1; i <= 50; i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		ClassLock2 c1 = new ClassLock2();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(c1);
		exec.execute(c1);
		exec.shutdown();
	}
}

