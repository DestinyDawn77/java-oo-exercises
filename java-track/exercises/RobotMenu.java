
import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList <Robot> robots;
	private Scanner s;
	

	public static void main(String[] args) {
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do{
			x = rm.startMenu();
			rm.processInput(x);
		}while(x != 8); // may need to adjust
	}
	
	public RobotMenu() // constructor
	{
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu()
	{
		System.out.println("Welcome to the Robot Start Menu!");
		System.out.println("1. Create a new Robot!");
		System.out.println("2. Display Robots");
		System.out.println("3. Select a Robot");
		System.out.println("4. Move your robot");
		System.out.println("5. Rotate your robot");
		System.out.println("6. Change Speed of your Robot");
		System.out.println("7. Find distance to another Robot");
		System.out.println("8. Exit");
		System.out.println("Please Select an Option: ");
		
		int selection = s.nextInt();
		while(selection < 1 || selection > 8)
		{
			System.out.println("Invalid Selection.  Please Try Again");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection)
	{
		if (selection == 1)
		{
			createRobot();
		}
		else if (selection == 2)
		{
			displayRobots();
		}
		else if(selection == 3)
		{
			displayRobots();
			Robot r = selectRobot();
		}
		else if (selection == 4)
		{
			moveRobot();
		}
		else if (selection == 5)
		{
			rotateRobot();
		}
		else if (selection == 6)
		{
			changeSpeed();
		}
		else 
		{
			robotDistance();
		}
		
	}
	public void createRobot()
	{
		System.out.println("Please give your robot a name: " );
		String name = s.next();
		
		System.out.println("Please enter x coord: ");
		int posX = s.nextInt();
		
		System.out.println("Please enter y coord: ");
		int posY = s.nextInt();
		
		System.out.println("Please enter movement speed in units: ");
		int speed = s.nextInt();
		
		System.out.println("Please enter orientation");
		System.out.println("Enter 0 for North, 1 for East, 2 for South, 3 for West: ");
		byte orientation = s.nextByte();
		
		robots.add(new Robot(name, posX, posY, speed, orientation));
	}
	
	public void displayRobots()
	{
		for(int i = 0; i < robots.size(); i++)
		{
			System.out.println((i+1) + ".)" + robots.get(i));
		}
	}
	
	public Robot selectRobot()
	{
		System.out.println("Please select a robot");
		int selection = s.nextInt();
		while (selection < 1 || selection > robots.size())
		{
			System.out.println("Invaid selection.  Please try again.");
			selection = s.nextInt();
		}
		return robots.get(selection - 1);
	}
	
	public void moveRobot(Robot r)
	{
		r.move();
	}
	
	public void rotateRobot(Robot r)
	{
		System.out.println("1. Rotate Left");
		System.out.println("2. Rotate Right");
		int selection = s.nextInt();
		while (selection < 1 || selection > 2)
		{
			System.out.println("Invalid selection.  Please try again");
			selection = s.nextInt();
		}
		
		if (selection == 1)
		{
			r.rotateLeft();
		}
		else
		{
			r.rotateRight();
		}
	}
	
	public void changeSpeed(Robot r)
	{
		System.out.println("Enter the new speed of your robot in units: ");
		int speed = s.nextInt();
		r.setSpeed(speed);
		
	}
	
	// need to write a distance function yet!
	
	

}
