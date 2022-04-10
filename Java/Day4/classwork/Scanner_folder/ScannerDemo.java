// how to accept input in java

import java.util.*;
public class ScannerDemo
{
	public static void main(String args[])
	{
		System.out.println("Enter name and age");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		System.out.println(name+"\t"+age);
	}
}