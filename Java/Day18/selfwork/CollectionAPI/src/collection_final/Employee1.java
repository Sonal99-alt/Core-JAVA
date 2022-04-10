package collection_final;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee2 implements Serializable
{
	private int empid;
	private String name,desig;
	private double salary;
	@Override
	public String toString() {
		return "Employee2 [empid=" + empid + ", name=" + name + ", desig=" + desig + ", salary=" + salary + "]";
	}
	public Employee2(int empid, String name, String desig, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
}
public class Employee1 
{
	public static void main(String[] args) 
	{
		Employee2 e1 = new Employee2(1, "Sonal", "JD", 1000);
		Employee2 e2 = new Employee2(2, "Sanket", "JD", 2000);
		Employee2 e3 = new Employee2(3, "Shashi", "JD", 3000);
		Employee2 e4 = new Employee2(4, "Shweta", "JD", 4000);
		
		List<Employee2> list = new ArrayList<Employee2>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Iterator<Employee2> itr = list.iterator();
		while(itr.hasNext())
		{
			Employee2 str = itr.next();
			System.out.println(str);
		}
		
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Uzer\\Desktop\\Java SE_Sanket\\Day18\\selfwork\\CollectionAPI\\src\\collection_final\\test1");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			

			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Uzer\\\\Desktop\\\\Java SE_Sanket\\\\Day18\\\\selfwork\\\\CollectionAPI\\\\src\\\\collection_final\\\\test1");
			ObjectInputStream ois = new  ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			List<Employee2> e = (List<Employee2>) ois.readObject();
			System.out.println(e);
		}catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
