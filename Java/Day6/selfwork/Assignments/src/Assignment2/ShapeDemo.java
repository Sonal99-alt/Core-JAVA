/*5) create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle",
 * "Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.*/
package Assignment2;

abstract class Shape
{
	abstract void draw();
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Draws triangle");
	}
}
class Polygon extends Shape
{
	void draw()
	{
		System.out.println("Draws Polygon");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draws Circle");
	}
}

public class ShapeDemo
{
	static void perform(Shape ref)
	{
		ref.draw();
	}
	public static void main(String args[])
	{
		Shape ref[] = new Shape[3];
		
		ref[0] = new Triangle();
		ref[1] = new Polygon();
		ref[2] = new Circle();
		
		perform(ref[0]);
		perform(ref[1]);
		perform(ref[2]);
	}
}
