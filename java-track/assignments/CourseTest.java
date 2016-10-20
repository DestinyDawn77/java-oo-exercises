import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTest {

	@Test
	public void addStudentTest() {
		// create a course (name, credits, seats)
		Course math101 = new Course ("Math101", 3, 5);
		// add a student and check credits
		Student a = new Student ("Amber", "Jones", 1001);
		math101.addStudent(a);
		
		// test for seats subtracting and student added to Roster
		assertTrue("Seats not subtracting properly!", math101.getRemainingSeats()== 4);
		assertTrue("Student not added!", math101.getRoster().size()== 1);
		
	}
	
	@Test
	public void addStudentBooleanTest() {
		// create a course (name, credits, seats)
		Course math101 = new Course ("Math101", 3, 5);
		// add a student and check boolean
		Student a = new Student ("Allison", "Jones", 1003);
		assertTrue("Boolean failing!", math101.addStudent(a)== true);
	}
	
	@Test
	public void addStudentNoSeatsTest() {
		// create a course (name, credits, seats)
		Course math101 = new Course ("Math101", 3, 0);
		
		// add a student even though no seats available
		Student a = new Student ("Allison", "Jones", 1003);
		assertTrue("Not checking seats properly!", math101.addStudent(a)== false);
	}
	
	@Test
	public void addDuplicateStudentTest() {
		// create a course (name, credits, seats)
		Course math101 = new Course ("Math101", 3, 5);
		// add a student and check credits
		Student a = new Student ("Amber", "Jones", 1001);
		// create another student with same ID
		Student b = new Student ("Alicia", "Jones", 1001);
		math101.addStudent(a);
		math101.addStudent(b);
		
		
		// test for seats subtracting and student added to Roster with duplicate!!!
		assertTrue("Added Student when there was a duplicate!", math101.getRemainingSeats()== 4);
		assertTrue("Added duplicate info!", math101.getRoster().size()== 1);
	}
	
	

}
