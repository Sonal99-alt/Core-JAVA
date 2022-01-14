class Course
{
	void start()
	{
	}
}
class Dac_Dbda extends Course
{
	void start()
	{
		System.out.println("start Dac_Dbda");
	}
}
class Mscit extends Course
{
	void start()
	{
		System.out.println("start Mscit");
	}
}

public class CourseDemo
{
	static void perform(Course ref)
	{
		ref.start();  // late binding or polymorphism  // polymorphic invocation
	}
	public static void main(String args[])
	{
		perform(new Dac_Dbda());
		perform(new Mscit());
	}
}
	
