
public class Robot {
	/* a robot has a:
	 * name (string)
	 * Position X (int)
	 * Position y (int)
	 * Speed (int)
	 * orientation (byte?)
	 */
	
	private String name;
	private int posX;
	private int posY;
	private int speed;
	private byte orientation;
	
	public Robot (String name, int posX, int posY, int speed, byte orientation)
	{
		this.name = name;
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
		this.orientation = orientation;
		/* North = 0, East = 1, South = 2, West = 3*/
	}
	
	/* a robot can:
	 * move (speed + orientation + position)
	 * rotate (90 degrees clockwise or counterclockwise)
	 * report distance to another robot
	 * to string
	 */
	public void move()
	{
		if (this.orientation == 0)
		{
			this.posY = this.posY + this.speed;
		}
		else if (this.orientation == 1)
		{
			this.posX = this.posX + this.speed;
		}
		else if (this.orientation == 2)
		{
			this.posY = this.posY - this.speed;
		}
		else
		{
			this.posX = this.posX - this.speed;
		}
		
		this.posCorrect();
		
	}
	
	public void posCorrect()
	{
		if (this.posX < 0)
		{
			System.out.println("You have Crashed into a Wall!");
			this.posX = 0;
		}
		if (this.posY < 0)
		{
			System.out.println("You have Crashed into a Wall!");
			this.posY = 0;
		}
	}
	
	public void rotateLeft()
	{
		this.orientation -=1;
		this.orientCorrect();
	}
	
	public void rotateRight()
	{
		this.orientation +=1;
		this.orientCorrect();
	}
	
	public void orientCorrect() // correct if orientation goes past the North point!
	{
		if (this.orientation < 0)
		{
			this.orientation = 3;
		}
		if (this.orientation > 3)
		{
			this.orientation = 0;
		}
	}
	
	public void distance(int x1,int x2,int y1,int y2)
	{
		double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		System.out.println("The distance between the robots is: " + d );
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public byte getOrientation() {
		return orientation;
	}

	public void setOrientation(byte orientation) {
		this.orientation = orientation;
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + ", posX=" + posX + ", posY=" + posY + ", speed=" + speed + ", orientation="
				+ orientation + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robotOne = new Robot("Martha",2,3,1,(byte) 0);
		Robot robotTwo = new Robot ("James", 2,4,1,(byte)1);
		
		System.out.println(robotOne.toString());
		robotOne.move();
		robotOne.rotateLeft();
		robotOne.move();
		System.out.println(robotOne.toString());
	}


}
