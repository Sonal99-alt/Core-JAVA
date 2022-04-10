//1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes //directly.
//provide accessor methods on these attributes and allow them to call from outside of your class.


public class Shape
{
	private int width;
	private int height;

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getHeight
	{
		return height;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getWidth
	{
		return width ;
	}
}
