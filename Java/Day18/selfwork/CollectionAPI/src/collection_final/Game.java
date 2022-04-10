package collection_final;

interface Gamer 
{
	public void play();
}

class Cricket implements Gamer
{
	public void play()
	{
		System.out.println("Cricket");
	}
}

class Chess implements Gamer
{
	public void play()
	{
		System.out.println("Chess");
	}
}

class Football implements Gamer
{
	public void play()
	{
		System.out.println("Football");
	}
}

class Common<T extends Gamer>
{
	T obj;

	public Common(T obj) 
	{
		this.obj = obj;
	}
	
	public void fun()
	{
		obj.play();
	}
}
public class Game
{
	public static void main(String args[])
	{
		Common<Chess> c = new Common<Chess>(new Chess());
		c.fun();
		Common<Cricket> cr = new Common<Cricket>(new Cricket());
		cr.fun();
		Common<Football> f = new Common<Football>(new Football());
		f.fun();
		
	}
}