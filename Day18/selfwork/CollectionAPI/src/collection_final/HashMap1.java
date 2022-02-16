package collection_final;

import java.util.*;
import java.util.Map.*;

public class HashMap1 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Sonal");
		map.put(2, "Sanket");
		map.put(3, "Shashi");
		map.put(4, "Megha");
		map.put(5, "Avinash");
		map.put(6, "Jitesh");
		map.put(7, "Rohan");
		map.put(8, "Ronak");
		map.put(9, "Bruno");
		map.put(10, "Jeet");

		Set<Entry<Integer, String>> set=map.entrySet();
		
		Iterator<Entry<Integer, String>> itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m = (Entry<Integer, String>)itr.next();
			System.out.println(m.getKey() + m.getValue());
		}
	}
}
