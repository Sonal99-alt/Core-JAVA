import static java.lang.System.*;
import java.util.*;
public class ScannerDemo1
{
	public static void main(String args[])
	{
		String str1="welcome to the java world";
	Scanner sc=new Scanner(str1).useDelimiter(" ");
		while(sc.hasNext())
		{
			String val=sc.next();
			
			out.println(val);

		}
		
	}
}