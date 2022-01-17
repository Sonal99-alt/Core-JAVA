public class StringDemo1
{
	public static void main(String args[])
	{
		String s1=new String("hello");

		System.out.println(s1);    // hello

		String s2=s1.concat("world");

		System.out.println(s1);   //  hello

		System.out.println(s2);   // helloworld
	}
}