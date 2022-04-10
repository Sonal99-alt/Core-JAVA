/*3) add 5 numbers inside CopyOnWriteArrayList and show how can you add one 
more number at the same time of traversal through its iterator.*/

package collectionApi;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			int t = itr.next();
			System.out.println(t);
			list.add(60);
		}
		
		Iterator<Integer> itr1 = list.iterator();
		while(itr1.hasNext())
		{
			int t = itr1.next();
			System.out.println(t);
		}
	}
}