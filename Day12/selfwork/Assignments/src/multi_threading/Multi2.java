//2) above program  using "implements Runnable" method.
package multi_threading;

public class Multi2 implements Runnable
{
	public void run()
	{
		for(char ch = 'A'; ch <= 'J'; ch++)
		{
			System.out.println(ch);
		}
	}
	public static void main(String[] args) 
	{
		Multi2 m1 = new Multi2();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		t1.start();
		t2.start();
	}
}