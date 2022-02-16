package collection_final;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Player
{
	int rank;
	String name;
	public Player(int rank, String name) 
	{
		super();
		this.rank = rank;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Players [rank=" + rank + ", name=" + name + "]";
	}
	
}
public class ICC 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Rohit Sharma");
		map.put(2, "Ajinkya Rahane");
		map.put(3, "MS Dhoni");
		map.put(4, "Sachin Tendulkar");
		map.put(5, "Megh Doot");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rank : ");
		int i = sc.nextInt();
		String str = map.get(i);
		System.out.println(str);
	}
}
