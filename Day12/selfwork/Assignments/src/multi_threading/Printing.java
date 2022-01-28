/*WAP to print 1 50 2 49 3 48 and so on... using 2 threads*/
package multi_threading;

import java.util.concurrent.*;

public class Printing
{
	public static void main(String[] args)
	{
		Print p = new Print();
		Increase i = new Increase(p);
		Decrease d = new Decrease(p);
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.execute(i);
		exec.execute(d);
	}
}
class Increase implements Runnable
{
	Print obj;
	public Increase(Print obj) 
	{
		this.obj = obj;
	}
	public void run()
	{
		int i = 1;
		while(i <= 50)
		{
			while(true)
			{
				obj.set(i++);
				try
				{
					Thread.sleep(300);
				}
				catch(InterruptedException ie)
				{
				}
			}
		}
	}
}
class Decrease implements Runnable
{
	Print obj;
	public Decrease(Print obj) 
	{
		this.obj = obj;
	}
	public void run()
	{
		int j = 50;
		while(j >= 1)
		{
			while(true)
			{
				obj.get(j--);
				try
				{
					Thread.sleep(300);
				}
				catch(InterruptedException ie)
				{
				}
			}
		}
	}
}
class Print
{
	boolean value;
	synchronized void set(int i)
	{
			while(value)
			{
				try 
				{
					wait();
				}catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			if(i <= 50)
			System.out.println(i);
			value = true;
			notify();
	}
	
	synchronized void get(int j)
	{
			while(!value)
			{
				try 
				{
					wait();
				}catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			value = false;
			if(j >= 1)
			System.out.println(j);
			notify();
	}
}