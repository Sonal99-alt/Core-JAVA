//5) Define 3 classes A , B and C
//in all these classes create static and nonstatic variables as well as methods.
//	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members //of A //,B  and C.

class A
{
	private static int a1;
	
	public static void setA1(int a1)
	{
		this.a1 = a1;
	}
	
	public static int getA1()
	{
		return a1;
	}
}

class B
{
	private static int b1;
	
	public static void setB1(int b1)
	{
		this.b1 = b1;
	} 
	
	public static int getB1()
	{
		return b1;
	}
}

class C
{
	private static int c1;
	
	public static void setC1(int c1)
	{
		this.c1 = c1;
	}
	
	public static int getC1()
	{
		return c1;
	}

}

public class Demo
{
	public static void main(String args[])
	{
		A.setA1(100);
		B.setB1(200);
		C.setC1(300);
		
		System.out.println(A.get)
	}
}