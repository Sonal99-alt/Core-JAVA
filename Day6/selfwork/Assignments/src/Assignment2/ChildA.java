
/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/

package Assignment2;

class Parent1
{
	int p1;
	void disp1()
	{
		System.out.println("in parent1"+ " " +p1);
	}
	public Parent1(int p1) 
	{
		super();
		this.p1 = p1;
	}
}

interface Parent2
{
	void disp2();
}

class Childs extends Parent1 implements Parent2
{
	int c1;
	public Childs(int p1, int c1) 
	{
		super(p1);
		this.c1 = c1;
	}
	@Override
	public void disp2() 
	{
		System.out.println("in child"+ " " +c1);
	}
}

public class ChildA 
{
	public static void main(String[] args) 
	{
		Childs c = new Childs(10, 20);
		c.disp1();
		c.disp2();
	}
}
