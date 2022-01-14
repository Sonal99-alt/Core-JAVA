//1) initialize a single dimension array and sort it in ascending order.
package Assignment2;

public class ArraySorting 
{
	public static void main(String[] args) 
	{
		int arr[] = {3, 25, 12, 8 ,7};
		int temp = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
