package Assignment;

class Person
{
	private int age;
	private String name;
	
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
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}

class Student extends Person
{
	private String qualifications;
	private int score_SSC;
	private int score_HSC;
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public int getScore_SSC() {
		return score_SSC;
	}
	public void setScore_SSC(int score_SSC) {
		this.score_SSC = score_SSC;
	}
	public int getScore_HSC() {
		return score_HSC;
	}
	public void setScore_HSC(int score_HSC) {
		this.score_HSC = score_HSC;
	}
	public Student(int age, String name, String qualifications, int score_SSC, int score_HSC) {
		super(age, name);
		this.qualifications = qualifications;
		this.score_SSC = score_SSC;
		this.score_HSC = score_HSC;
	}
	
}

class Cdac_Student extends Student
{
	private int score_BE;

	public int getScore_BE() {
		return score_BE;
	}

	public void setScore_BE(int score_BE) {
		this.score_BE = score_BE;
	}

	public Cdac_Student(int age, String name, String qualifications, int score_SSC, int score_HSC, int score_BE) {
		super(age, name, qualifications, score_SSC, score_HSC);
		this.score_BE = score_BE;
	}
}

class Doctor extends Person
{
	private int pcb_score;
	private int neet_score;
	public int getPcb_score() {
		return pcb_score;
	}
	public void setPcb_score(int pcb_score) {
		this.pcb_score = pcb_score;
	}
	public int getNeet_score() {
		return neet_score;
	}
	public void setNeet_score(int neet_score) {
		this.neet_score = neet_score;
	}
	public Doctor(int age, String name, int pcb_score, int neet_score) {
		super(age, name);
		this.pcb_score = pcb_score;
		this.neet_score = neet_score;
	}
}

class Dermatologist extends Doctor
{
	private int mbbs_score;

	public int getMbbs_score() {
		return mbbs_score;
	}

	public void setMbbs_score(int mbbs_score) {
		this.mbbs_score = mbbs_score;
	}

	public Dermatologist(int age, String name, int pcb_score, int neet_score, int mbbs_score) {
		super(age, name, pcb_score, neet_score);
		this.mbbs_score = mbbs_score;
	}
}

public class InheritanceAll 
{
	public static void main(String[] args) 
	{
		Person p = new Person(4, "Damru");
		System.out.println(p.getAge()+ " " +p.getName());
		
		Student s = new Student(22, "Sonal", "HSC", 60, 84);
		System.out.println(s.getAge()+ " " +s.getName()+ " " +s.getQualifications()+ " " +s.getScore_HSC()+ " " +s.getScore_SSC());
		
		Cdac_Student c = new Cdac_Student(24, "Sanket", "BE", 60, 84, 65);
		System.out.println(c.getAge()+ " " +c.getName()+ " " +c.getQualifications()+ " " +c.getScore_BE()+ " " +c.getScore_HSC()+ " " +c.getScore_SSC());
		
		Doctor d = new Doctor(25, "Dhiraj", 70, 89);
		System.out.println(d.getAge()+ " " +d.getName()+ " " +d.getNeet_score()+ " " +d.getPcb_score());
		
		Dermatologist e = new Dermatologist(26, "Sudhir", 50, 60, 75);
		System.out.println(e.getAge()+ " " +e.getName()+ " " +e.getPcb_score()+ " " +e.getNeet_score()+ " " +e.getMbbs_score());
	}
}
