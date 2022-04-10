//2) create a class "DemoArr",with the function "disp". create 4 objects of this class in an array.
//Traverse the array and invoke "disp" on each objects.

package Assignment2;

public class DemoArr 
{
	int num;
	
	DemoArr(int num)
	{
		this.num = num;
	}
	void disp()
	{
		System.out.println(num);
	}
	public static void main(String[] args) 
	{
		DemoArr ref[] = new DemoArr[4];
		for(int i = 0, j = 10; i < ref.length; i++, j+=10)
		{
			ref[i] = new DemoArr(j);
		}
		
		for(int i = 0; i < ref.length; i++)
		{
			ref[i].disp();
		}
	}
	
}