package arvind;

class Watch 
{
	private int WatchID;
	private String WatchName;
	private int price;
	private String Brand;
	public int getWatchID() {
		return WatchID;
	}
	public void setWatchID(int watchID) {
		WatchID = watchID;
	}
	public String getWatchName() {
		return WatchName;
	}
	public void setWatchName(String watchName) {
		WatchName = watchName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public Watch(int watchID, String watchName, int price, String brand) {
		super();
		WatchID = watchID;
		WatchName = watchName;
		this.price = price;
		Brand = brand;
	}
}

public class Counting
{
	static void countWatchesByBrand(Watch arr[], String brand)
	{
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getBrand().equals("Apple"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		Watch arr[] = new Watch[4];

		arr[0] = new Watch(111, "Series 7", 30000, "Apple");
		arr[1] = new Watch(22, "Galaxy 3", 15000, "Samsung");
		arr[2] = new Watch(333, "Series 5", 20000, "Apple");
		arr[3] = new Watch(444, "F7", 10000, "Fossil");
		countWatchesByBrand(arr, "Apple");
		//System.out.println(countWatchesByBrand(arr, "Fossil"));
		
	}
}