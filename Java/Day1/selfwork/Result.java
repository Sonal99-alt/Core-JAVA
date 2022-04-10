//5)	Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  

public class Result
{
	public static void main(String[] args)
	{
		int marks = 56;
		if(marks == 100)
		System.out.println("Perfect score");
		else if(marks >= 75)
		System.out.println("Distinction");
		else if(marks >= 60)
		System.out.println("First class");
		else if(marks >= 50)
		System.out.println("Second class");
		else if(marks >= 40)
		System.out.println("Pass");
		else
		System.out.println("Fail");
	}
}