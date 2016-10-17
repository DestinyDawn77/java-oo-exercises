
public class Student {
	
	/*
	 * student has:
	 * fname (string)
	 * lname (string)
	 * ID (int)
	 * Credits (int)
	 * valueCredits (int)
	 * GPA (double)
	 */
	
	private String fname;
	private String lname;
	private int ID;
	private int credits;
	private double valueCredits;
	private double GPA;
	
	public Student (String fname, String lname, int ID)
	{
		this.fname = fname;
		this.lname = lname;
		this.ID = ID;
		this.GPA = 0;
		this.valueCredits = 0;
		this.credits = 0;
		
		
	}
	
	public void submitGrade(double grade, double credits)
	{
	    double gpaTotal = grade * credits;
		this.valueCredits = gpaTotal + (this.GPA * this.credits);
		this.credits += credits;
		this.GPA = this.computeGPA();
	}
	
	public String getClassStanding()
	{
		if(this.credits < 30)
		{
			return "Freshman";
		}
		else if (this.credits >= 30 && this.credits < 60)
		{
			return "Sophomore";
		}
		else if (this.credits >= 60 && this.credits < 90)
		{
			return "Junior";
		}
		else
		{
			return "Senior";
		}
	}
	
	public double computeTuition()
	{
		double tuition = 0.0;
		int credits = this.credits;
		
		if(credits ==0)
		{
			return tuition;
		}
		else if (credits%15 == 0)
		{
			tuition = 20000.00 * (double)credits/15.0;
			return tuition;
		}
		else
		{
			double tuitionRate = (credits%15)* 1333.33;
			tuition = tuitionRate + ((credits/15)*20000.00);
			return tuition;
		}
	}
	
	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Student createLegacy(Student a, Student b)
	{
		String babyFName = a.getName();
		String babyLName = b.getName();
		int babyID = a.ID + b.ID;
		Student baby = new Student (babyFName, babyLName, babyID);
		double babygpa = a.averageGPA(a,b);
		baby.setGPA(babygpa);
		baby.credits = Math.max(a.credits, b.credits);
		return baby;
	}
	
	public double computeGPA() // need to extend the rounding!
	{
		double GPA = (double)Math.round((this.valueCredits/this.credits)*1000.00)/1000.00;
		return GPA;
	}
	
	public double averageGPA(Student a, Student b)
	{
		double gpa = (a.GPA + b.GPA)/2.000;
		return gpa;
	}
	
	public String getName()
	{
		return this.fname + " " + this.lname;
	}
	
	
	

	@Override
	public String toString() {
		return fname + " " + lname + ", ID=" + ID;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getID() {
		return ID;
	}

	public int getCredits() {
		return credits;
	}

	public double getValueCredits() {
		return valueCredits;
	}

	public double getGPA() {
		return this.GPA;
	}
	
	public int getStudentID()
	{
		return this.ID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student testStudent = new Student ("John", "Doe", 0001);
		Student testStudent2 = new Student ("Jane", "Doe",0002 );
		testStudent.submitGrade(4,3);
		testStudent.submitGrade(3, 3);
		testStudent.submitGrade(2, 3);
		testStudent.submitGrade(4, 3);
		testStudent.submitGrade(1, 4);
		System.out.println(testStudent.getClassStanding());
		System.out.println(testStudent.getCredits());
		System.out.println(testStudent.getGPA());
		System.out.println(testStudent.toString());
		Student Baby = testStudent.createLegacy(testStudent, testStudent2);
		System.out.println(Baby.toString());
	}

	

}
