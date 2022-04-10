package multi_threading;

abstract class Parent
{
	int a = 100;
	void behaviour()
	{
		System.out.println("Behaves");
	}
}
class Child1 extends Parent
{
	int b = 200;
	void behaviour()
	{
		System.out.println(b);
		System.out.println("Child Behaves");
	}
}
public class Main1
{
	public static void main(String[] args) 
	{
		Child1 c = new Child1();
	}
}