//2) Define a class "MyClass" and make sure clients can instantiate it , 
//a) without any argument
//b) with one int argument
//c) with two int arguments

class MyClass
{
	private int num1;
	private int num2;
	private int num3;
	
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	
	public int getNum1()
	{
		return num1;
	}
	
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	
	public int getNum2()
	{
		return num1;
	}
	
	public void setNum3(int num3)
	{
		this.num3 = num3;
	}
	
	public int getNum3()
	{
		return num3;
	}
	Myclass()
	{

	}

	MyClass(int num1)
	{
		this.num1 = num1;
	}

	MyClass(int num2, int num3)
	{
		this.num2 = num2;
		this.num3 = num3;
	}
}