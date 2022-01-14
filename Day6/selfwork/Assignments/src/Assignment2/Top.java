//4) Create a class "Top1" with "disp1()" method.
//From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
//Now show how will u achieve dynamic polymorphism.
package Assignment2;

class Top1
{
	void disp()
	{
		System.out.println("In top1");
	}
}
class Bottom1 extends Top1
{
	void disp()
	{
		super.disp();
		System.out.println("In bottom1");
	}
}
class Bottom2 extends Top1
{
	void disp()
	{
		super.disp();
		System.out.println("In bottom2");
	}
}
class Bottom3 extends Top1
{
	void disp()
	{
		super.disp();
		System.out.println("In bottom3");
	}
}
public class Top 
{
	public static void main(String[] args) 
	{
		Bottom1 b1 = new Bottom1();
		Bottom2 b2 = new Bottom2();
		Bottom3 b3 = new Bottom3();
		
		b1.disp();
		b2.disp();
		b3.disp();
	}
}
