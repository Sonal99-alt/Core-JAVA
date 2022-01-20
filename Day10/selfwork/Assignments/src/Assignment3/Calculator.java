package Assignment3;


public class Calculator 
{
	private int  i;
	public void calcdouble(int i) throws MyArithException
	{
		this.i = i;
		if(i <= 0)
		{
			throw new MyArithException("Enter a positive integer");
		}
		else
		System.out.println(i*i);
	}
}
