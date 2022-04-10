package Items;

public class Items 
{
	String itemids;
	String name;
	int cost;
	Items(String itemids, String name, int cost) 
	{
		super();
		this.itemids = itemids;
		this.name = name;
		this.cost = cost;
	}
	
	void display()
	{
		System.out.println("Items [itemids=" + itemids + ", name=" + name + ", cost=" + cost + "]");
	}

	public static void main(String[] args)
	{
		Items i1 = new Items("1", "Radio", 2000);
		i1.display();
	}
}
