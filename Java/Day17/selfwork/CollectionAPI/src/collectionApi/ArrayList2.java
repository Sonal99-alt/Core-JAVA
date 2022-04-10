/*2) create LinkedList with the values 10,20,30 and 40.
display it.
now insert 500 in the beginning.
	insert 400 at 2nd position.
	add 1000 at the end.
display the list again.*/
package collectionApi;

import java.util.*;

public class ArrayList2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			int t = itr.next();
			System.out.println(t);
		}
		list.remove(0);
		list.add(0, 400);
		list.remove(1);
		list.add(1, 500);
		list.remove(3);
		list.add(3, 1000);
		System.out.println("new list");
		Iterator<Integer> itr1 = list.iterator();
		while(itr1.hasNext())
		{
			int t = itr1.next();
			System.out.println(t);
		}
	}
}