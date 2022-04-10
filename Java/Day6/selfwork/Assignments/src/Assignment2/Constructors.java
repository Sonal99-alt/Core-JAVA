
/*8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.*/
package Assignment2;

class Base1
{
	int b1, b2, b3;
}
class Sub1 extends Base1
{
	int s1, s2;
	void disp()
	{
		System.out.println("in sub1"+ " " +s1+ " " +s2);
	}
	Sub1()
	{
		
	}
	Sub1(int s1)
	{
		this.s1 = s1;
	}
	Sub1(int s1, int s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
}

public class Constructors 
{
	public static void main(String[] args) 
	{
		Sub1 s = new Sub1(10, 20);
		s.disp();
	}
}
