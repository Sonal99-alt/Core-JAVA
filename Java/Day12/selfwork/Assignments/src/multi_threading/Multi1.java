//1) create a multi-threaded application by using  "extends Thread " method.
//create 2 threads. they should display characters from A to J.
package multi_threading;

public class Multi1 extends Thread
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
		Multi1 m1 = new Multi1();
		m1.start();
		Multi1 m2 = new Multi1();
		m2.start();
	}
}
