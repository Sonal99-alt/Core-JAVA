package collection_final;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empID;
	private String empname;
	private String desig;
	public Employee(int empID, String empname, String desig) 
	{
		this.empID = empID;
		this.empname = empname;
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empname=" + empname + ", desig=" + desig + "]";
	}
	
}
public class Employees 
{
	public static void main(String[] args)
	{
		try {
		List<Employee> list = new ArrayList<Employee>();
			Employee e1 = new Employee(1, "Sonal", "JD");
			Employee e2 = new Employee(2, "Sanket", "JD");
			Employee e3 = new Employee(3, "Shashi", "JD");
			Employee e4 = new Employee(4, "Shweta", "JD");
		
			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.add(e4);
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Uzer\\Desktop\\Java SE_Sanket\\Day18\\selfwork\\CollectionAPI\\src\\collection_final\\test");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Uzer\\\\Desktop\\\\Java SE_Sanket\\\\Day18\\\\selfwork\\\\CollectionAPI\\\\src\\\\collection_final\\\\test");
			ObjectInputStream ois = new  ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Employee> e = (List<Employee>) ois.readObject();
			System.out.println(e);
		}catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
