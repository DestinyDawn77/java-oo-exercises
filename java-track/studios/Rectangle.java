
public class Rectangle {
	
	/* the Rectangle has a
	 * length (double)
	 * width (double)
	 * area (double)
	 * parameter (double)
	 */
	
	private double length;
	private double width;
	private double area;
	private double parameter;
	
	/* Constructor function has same name as class and initializes all fields above*/
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
		this.area = length * width;
		this.parameter = 2.0 * length + 2.0 * width;
	}
	
	/* The Rectangle CAN
	 * compare with another and determine if it is smaller or larger
	 * report area
	 * report parameter
	 * report of it is a square
	 */
	
	/* methods or "attributes" do the actions listed above*/
	
	public void compare(Rectangle r2)
	{
		if (this.area > r2.area)
		{
			System.out.println("The first rectangle is larger than the 2nd");
		}
		else if (this.area < r2.area)
		{
			System.out.println("The first rectangle is smaller than the 2nd");
		}
		else
		{
			System.out.println("The Rectangles are the same!");
		}
	}
	
	public void isSquare()
	{
		if(this.length == this.width)
		{
			System.out.println("The rectangle is in fact... a SQUARE!");
		}
		else
		{
			System.out.println("Nope, definately NOT a square!");
		}
	}

	public double getArea() {
		return area;
	}

	public double getParameter() {
		return parameter;
	}

	@Override
	public String toString() {
		return "[length=" + length + ", width=" + width + ", area=" + area + ", parameter=" + parameter + "]";
	}
	
	
	public static void main(String[] args)
	{
	/* Initiate Constructor Method by saying "New" Rectangle and input the parameters*/
	Rectangle R1 = new Rectangle(2.0,2.0);
	Rectangle R2 = new Rectangle (2.0,3.0);
	
	/* perform the actions by calling the methods on the object*/
	R1.compare(R2);
	R1.isSquare();
	System.out.println("Area of Rectangle one is " + R1.getArea());
	System.out.println("Parameter of Rectangle one is " + R1.getParameter());
	
	System.out.println("Rectangle 1: " + R1.toString());
	System.out.println("Rectangle 2: " + R2.toString());
	}
}