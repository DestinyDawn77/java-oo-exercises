import java.util.ArrayList;

public class Course {
	
	/* a course has:
	 * name (String)
	 * credits (int)
	 * seats remaining (int)
	 * roster (array)
	 */
	
	private String name;
	private int credits;
	private int seats;
	private ArrayList <Student> roster;
	
	public Course (String name, int credits, int seats)
	{
		this.name = name;
		this.credits = credits;
		this.seats = seats;
		roster = new ArrayList <Student>();
	}
	
	public void generateRoster()
	{
		for (int i = 0; i < roster.size(); i++)
		{
			String studentName = roster.get(i).getName();
			System.out.println(studentName); 
		}
	}
	
	public boolean addStudent(Student a)
	{
		if(this.seats < 1)
		{
			System.out.println("first false");
			return false;
		}
		else
		{
			
			for (int i = 0; i < roster.size(); i++)
				{
					int ID = a.getID();
					int studentID = roster.get(i).getID();
					if (ID == studentID)
					{
						System.out.println("second false on duplicate");
						return false;
					}
				}
					this.seats -=1;
					roster.add(a);
					return true;
			}
		
		}
	
		
		
	
	
	public double averageGPA()
	{
		double gpa = 0;
		double counter = 0;
		for (int i = 0; i < roster.size(); i++)
		{
			gpa += roster.get(i).getGPA();
			counter += 1;
			
		}
		return gpa/counter;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + "]";
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

	public int getRemainingSeats() {
		return seats;
	}

	public ArrayList<Student> getRoster() {
		return roster;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
