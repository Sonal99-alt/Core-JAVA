package Assignment;

class Students
{
	private int age;
	private String name;
	private int score;
	private String qualifications;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public Students(int age, String name, int score, String qualifications) {
		super();
		this.age = age;
		this.name = name;
		this.score = score;
		this.qualifications = qualifications;
	}
	
	
}
public class StudentArray 
{
	public static void main(String[] args) 
	{
		Students arr[] = new Students[3];
		
		arr[0] = new Students(22, "Sonal", 89, "BE");
		arr[1] = new Students(24, "Sanket", 95, "BE");
		arr[2] = new Students(34, "Sashikant", 60, "BE");
		
		for(int i =0; i < arr.length; i++)
		{
			System.out.println(arr[i].getAge()+ " " +arr[i].getName()+ " " +arr[i].getQualifications()+ " " +arr[i].getScore());
		}
		
	}

}
