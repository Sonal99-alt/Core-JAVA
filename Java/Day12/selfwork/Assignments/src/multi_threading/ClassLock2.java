/*5) create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.
(use implements method)
*/
package multi_threading;
public class ClassLock2 implements Runnable
{
	public void run()
	{
		disp();
	}
	void disp()
	{
		if(Thread.currentThread().getName().equalsIgnoreCase("first"))
		{
			for(int i = 1; i <= 50; i++)
				System.out.println(i);
		}
		else if(Thread.currentThread().getName().equalsIgnoreCase("second"))
		{
			for(int i = 50; i >= 1; i--)
				System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		ClassLock2 c1 = new ClassLock2();
		Thread t1 = new Thread(c1, "first");
		Thread t2 = new Thread(c1, "second");
		
		t1.start();
		t2.start();
	}
}

