package interfaces;

import java.util.ArrayList;

public class Circle implements Measurable {
	// has a radius
	private float radius;
	
	public Circle(float r){
		this.radius = r;
	}

	// the class MUST define the methods listed in the interface Measurable, but they behave differantly for this object!!!
	
	public float getArea() {
		return (float) ((Math.PI)*(Math.pow(this.radius, 2)));
	}

	
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return (float)(2 * Math.PI) * this.radius;
	}
	
	public static void main(String [] args){
		
		// because this class implements measurable, it can use the same method on BOTH objects, and even save BOTH object types to the same ArrayList!
		
		Rectangle r = new Rectangle(3,3);
		Circle c = new Circle(2);
		
	
		ArrayList <Measurable> shapes = new ArrayList <Measurable>();
		shapes.add(r);
		shapes.add(c);
		
		for (int i =0; i < shapes.size(); i++)
		{
			Measurable shape = shapes.get(i); // "Measurable" is now a type that can be used
			System.out.println("Area: " + shape.getArea());
			System.out.println("Parimeter: " + shape.getPerimeter());
			System.out.println(shape.getClass()); // lists the class of the object
			System.out.println("");
		}
		
	}

}
