/*9) create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.inside "perform()" 
see to it that any child object passed ,its "play()" method should be invoked. Call "perform()" method from main function.*/
package Assignment2;

interface Game
{
	public void play();
}
class Cricket implements Game
{
	@Override
	public void play() 
	{
		System.out.println("plays cricket");
	}
}
class Football implements Game
{
	@Override
	public void play() 
	{
		System.out.println("plays football");
	}
}
class Tennis implements Game
{
	@Override
	public void play() 
	{
		System.out.println("plays tennis");
	}
}
public class Demo 
{
	static void perform(Game ref)
	{
		ref.play();
	}
	public static void main(String[] args) 
	{
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	}
}
