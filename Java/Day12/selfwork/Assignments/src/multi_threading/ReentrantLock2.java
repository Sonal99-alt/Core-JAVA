/*4) create a multi-threaded application by using Thread pool and ReentrantLock.create 2 threads. 
each thread should display numbers from 1 to 10. [ make sure while one thread executes , other thread should not interfere ]
Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to 
display nos. from 1 to 5 and then previous thread will display nos. from 6 to 10 and so on.*/
package multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;

public class ReentrantLock2 implements Runnable
{
	ReentrantLock mylock = new ReentrantLock();
	Condition c = mylock.newCondition();
	public void run()
	{
		mylock.lock();
		perform();
		mylock.unlock();
	}
	
	void perform()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			if(i == 5)
				try 
				{
					c.await();
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			c.signalAll();
		}
	}
	public static void main(String[] args) 
	{
		ExecutorService exec = Executors.newFixedThreadPool(2);
		ReentrantLock2 r1 = new ReentrantLock2();
		exec.execute(r1);
		exec.execute(r1);
		exec.shutdown();
	}
}
