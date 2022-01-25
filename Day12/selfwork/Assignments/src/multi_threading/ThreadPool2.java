
/*2) create a multi-threaded application by using Thread pool.create 2 threads. each thread should display numbers from 1 to
 *  10.
 [ make sure while one thread executes , other thread should not interfere ]
Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to display nos. 
from 1 to 5 and then previous thread will display nos. from 6 to 10 and so on.*/
package multi_threading;

import java.util.concurrent.*;

public class ThreadPool2 implements Runnable
{
	void disp1()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			if(i == 5)
				try
				{
					wait();
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			notify();
		}
	}
	synchronized public void run()
	{
		disp1();
	}
	public static void main(String[] args) 
	{
		ThreadPool2 t = new ThreadPool2();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(t);
		exec.execute(t);
		exec.shutdown();
	}
}
