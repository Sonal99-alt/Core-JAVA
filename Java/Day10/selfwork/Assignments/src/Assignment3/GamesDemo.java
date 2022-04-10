package Assignment3;

abstract class Game
{
	abstract void play();
}

class Cricket extends Game
{
	void play()
	{
		System.out.println("Plays Cricket");
	}
}

class Football extends Game
{
	void play()
	{
		System.out.println("Plays Football");
	}
}

class Tennis extends Game
{
	void play()
	{
		System.out.println("Plays Tennis");
	}
}
public class GamesDemo 
{
	public static void main(String[] args)
	{
		Game arr[] = new Game[3];
		arr[0] = new Football();
		arr[1] = new Cricket();
		arr[2] = new Tennis();
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i].play();
		}
	}
}
