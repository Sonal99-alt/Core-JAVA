// A subclass cannot actually modify the values of private properties in its parent, but it could behave as though it has
 
class base
{
	private int num;
	public base(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
class sub extends base
{
	private int num;
	public sub(int num)
	{
		super(0);
		this.num=num;
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
public class Demo5
{
	static void perform(base ref)
	{
		System.out.println(ref.getNum());
	}		
	public static void main(String args[])
	{
		base b1=new base(100);
		// invoke perform twice for "b1" 
		perform(b1); // output 100
		perform(b1); // output 100

		sub s1=new sub(500);
		// invoke perform twice for "s1"
		perform(s1); // output 500
			s1.setNum(-10); // violates immutability
		perform(s1); // output -10
	}
}
/*
to avoid above problem,
Ensure that the class can't be extended. This prevents careless or malicious subclasses from compromising the immutable behavior of the class by behaving as if the object's state has changed.
*/