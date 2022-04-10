//2)	using switch ….case   display whether character is vowel or not.

public class Vowel
{
	public static void main(String[] args)
	{
		char ch = 'B';
		switch(ch)
		{
			case 'A': 
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'U': System.out.println("Vowel");
				break;
			default: System.out.println("Not Vowel");
		}
	}
}