/*1) accept 10 numbers from user and add them inside the ArrayList.
using Iterator display all the numbers bidirectionally.*/
package collectionApi;

import java.util.*;

public class ArrayLList1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter 10 numbers :");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Enter number "+i+ ":");
			int n = sc.nextInt();
			list.add(n);
		}
		
		Iterator<Integer> itr = list.iterator();
		System.out.println("Top to bottom");
		while(itr.hasNext())
		{
			int t = itr.next();
			System.out.println(t);
		}
	}
}
