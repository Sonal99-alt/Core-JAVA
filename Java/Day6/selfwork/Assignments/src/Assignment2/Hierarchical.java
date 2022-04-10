//3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.
package Assignment2;

class Parents 
{
	int p;
	
	public Parents(int p) 
	{
		super();
		this.p = p;
	}

	void disp()
	{
		System.out.println("In parents"+ " " +p);
	}
}
class Child1 extends Parents
{
	int c1;
	
	public Child1(int p, int c1) 
	{
		super(p);
		this.c1 = c1;
	}

	void disp()
	{
		super.disp();
		System.out.println("In child1"+ " " +c1);
	}
}
class Child2 extends Parents
{
	int c2;
	
	public Child2(int p, int c2) {
		super(p);
		this.c2 = c2;
	}

	void disp()
	{
		super.disp();
		System.out.println("In child2"+ " " +c2);
	}
}
public class Hierarchical 
{
	public static void main(String[] args) 
	{
		Child1 c1 = new Child1(10, 20);
		Child2 c2 = new Child2(30, 40);
		
		c1.disp();
		c2.disp();
	}

}
