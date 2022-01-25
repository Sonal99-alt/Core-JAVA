package multi_threading;

import java.util.concurrent.*;

public class ThreadPool1 implements Runnable
{
	synchronized public void run()
	{
		for(char ch = 'A'; ch <= 'J'; ch++)
			System.out.println(ch);
	}
	public static void main(String[] args) 
	{
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.execute(new ThreadPool1());
		exec.execute(new ThreadPool1());
	}
}
