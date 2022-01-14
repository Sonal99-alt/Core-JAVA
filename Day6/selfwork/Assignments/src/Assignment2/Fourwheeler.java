//2) create a class "Vehicle", define a method "public void start()" in it. 
//From this class derive a class FourWheeler. 
//How will u override "start()" method of parent class ?
package Assignment2;

class Vehicle
{
	public void start()
	{
		System.out.println("Vehicle starts");
	}
}
public class Fourwheeler extends Vehicle 
{
	public void start()
	{
		super.start();
		System.out.println("Fourwheeler starts");
	}
	public static void main(String[] args) 
	{
		Fourwheeler fw = new Fourwheeler();
		fw.start();
	}

}
