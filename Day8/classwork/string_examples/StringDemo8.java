class MyClass
{
	String str="hello";
}
public class StringDemo8
{
	public static void main(String args[])
	{
		String s1="hello";
		
		if(s1==new MyClass().str)
		{
			System.out.println("they are ==");
		}
		else
		{
			System.out.println("they are !=");
		}
	}
}
		