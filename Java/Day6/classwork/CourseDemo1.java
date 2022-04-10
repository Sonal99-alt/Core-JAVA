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
	void orientation()
	{
		System.out.println("introduction and Vikram sir's session");
	}
}
class Mscit extends Course
{
	void start()
	{
		System.out.println("start Mscit");
	}
}

public class CourseDemo1
{
	static void perform(Course ref)
	{
		ref.start();  // late binding or polymorphism  // polymorphic invocation

		// here I would like to invoke "orientation" also along with "start" method

		// ref.orientation();  // it's not possible because "orientation" method does not present inside "Course" class

	}
	public static void main(String args[])
	{
		perform(new Dac_Dbda());
		perform(new Mscit());
	}
}
	
