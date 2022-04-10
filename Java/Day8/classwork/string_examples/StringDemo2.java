public class StringDemo2
{
	public static void main(String args[])
	{
		String s1=new String("hello");

		String s2="hello";

		String s3="hello";


		if(s1==s2)     
		{
			System.out.println("s1 == s2");
		}
		else
		{
			System.out.println("s1 !=s2");
		}


		if(s2==s3)    
		{
			System.out.println("s2==s3");
		}
		else
		{
			System.out.println("s2 !=s3");
		}
		if(s1.equals(s2))
		{
			System.out.println("s1 equals s2");
		}
		else
		{
			System.out.println("s1 not equals s2");
		}
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());  
	}
}