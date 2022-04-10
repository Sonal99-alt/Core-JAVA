package Assignment3;

import java.util.Scanner;

public class MyCalcApp 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int i = sc.nextInt();
		try 
		{
			c.calcdouble(i);
		} catch (MyArithException e) 
		{
			e.printStackTrace();
		}
	}
}
