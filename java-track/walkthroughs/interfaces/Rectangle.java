package interfaces;

public class Rectangle implements Measurable {
	
	// a rectangle has a:
	//height (int)
	//width (int)
	
	private float height;
	private float width;
	
	public Rectangle(float h, float w){
		this.height=h;
		this.width = w;
	}
	
	// because the class implements Measurable, it MUST somewhere define the methods listed in the "Measurable" interface!!!

	public float getArea() {
		return this.height * this.width;
	}

	public float getPerimeter() {
		return 2*this.height + 2*this.width;
	}
	
	

}
