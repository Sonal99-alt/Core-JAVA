public class StringDemo3
{
	public static void main(String args[])
	{
		String s2="hello";

		String s3=s2.intern();
/*
When the intern method is invoked, if the pool already contains a string equal to this String object (s2)  as determined by the equals(Object) method, then the string from the pool is returned.
*/

		if(s2==s3)    
		{
			System.out.println("s2==s3");
		}
		else
		{
			System.out.println("s2 !=s3");
		}
		 
	}
}








