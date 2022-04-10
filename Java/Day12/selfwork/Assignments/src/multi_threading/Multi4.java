//4)create 2 threads. Write a program which displays number 1 to 
//10 using class lock. 
//[hint:- use "implements Runnable" and synchronized block]
package multi_threading;

import java.util.concurrent.*;

public class Multi4 implements Runnable
{
	@Override
	public void run() 
	{
		perform();
	}
	
	synchronized static void perform()
	{
		for(int i = 0; i <= 10; i++)
			System.out.println(i);
	}
	public static void main(String[] args)
	{
		Multi4 m = new Multi4();
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.execute(m);
		exec.execute(m);
	}	
}
