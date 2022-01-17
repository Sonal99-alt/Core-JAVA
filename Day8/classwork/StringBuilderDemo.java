abstract class Weapon
{
	abstract public void attack();
}	

class Gun extends Weapon
{
	public void attack()
	{
		//attacks with gun
	}
		
	public void fillBulletes()
	{
		//fills bullet
	}
}

class Bomb extends Weapon
{
		public void attack()
		{
			//attacks with bomb
		}
}

class Soldier
{
		perform(Weapon w) //Weapon w = new Gun(); //Upcasting
		{
			if(w instanceof Gun) {
			Gun g = ((Gun) ref); //Downcasting
			g.fillBulletes();
			}
			ref.attack();
		}	
		main()
		{
			Gun g = new Gun();
			perform(g);
			perform(new Bomb());
		}
}		
		



