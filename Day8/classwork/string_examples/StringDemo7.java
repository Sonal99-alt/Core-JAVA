public class StringDemo7
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2="he";
		String s3=s2.concat("llo");
		if(s1==s3)
		{
			System.out.println("s1 == s3");
		}
		else
		{
			System.out.println("s1 != s3");
		}
	}
}
		