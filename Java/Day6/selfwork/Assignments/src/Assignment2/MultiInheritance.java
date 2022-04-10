//1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, 
//if needed how will u invoke parent class constructor from child class ?
package Assignment2;

class Parent
{
	int p;
	public Parent(int p) 
	{
		super();
		this.p = p;
	}
	void disp()
	{
		System.out.println("In parent"+ " " +p);
	}
	
}

class Child extends Parent
{
	int c;
	public Child(int p, int c) {
		super(p);
		this.c = c;
	}
	void disp()
	{
		super.disp();
		System.out.println("In child"+ " " +c);
	}
}

class GrandChild extends Child
{
	int gc;
	public GrandChild(int p, int c, int gc) {
		super(p, c);
		this.gc = gc;
	}
	void disp()
	{
		super.disp();
		System.out.println("In grandchild"+ " " +gc);
	}
}

public class MultiInheritance 
{
	public static void main(String[] args) 
	{
		GrandChild g = new GrandChild(10, 20, 30);
		g.disp();
	}
}
