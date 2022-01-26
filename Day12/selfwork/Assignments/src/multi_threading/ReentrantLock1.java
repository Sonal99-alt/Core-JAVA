/*3) create a multi-threaded application by using Thread pool and ReentrantLock (explicit locking) .create 2 threads. 
each thread should display characters from A to J.
 [ make sure while one thread executes , other thread should not interfere ]*/

package multi_threading;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class ReentrantLock1 implements Runnable
{
	ReentrantLock mylock = new ReentrantLock();
	public void run()
	{
		mylock.lock();
		perform();
		mylock.unlock();
	}
	
	void perform()
	{
		for(char ch = 'A'; ch <= 'J'; ch++)
			System.out.println(ch);
	}
	public static void main(String[] args) 
	{
		ExecutorService exec = Executors.newFixedThreadPool(2);
    	ReentrantLock1 r1 = new ReentrantLock1();	
		exec.execute(r1);
		exec.execute(r1);
		exec.shutdown();
	}
}
