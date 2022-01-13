//3) Define a class "Emp" with private static member "int cnt".
//How will u make sure that outsiders can read the value of cnt ?

class Emp
{
	private static int cnt;
	
	public static void setCnt(int cnt)
	{
		this.cnt = cnt;
	}
	
	public static int getCnt()
	{
		return cnt;
	}
}