import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void GPAtest() {
		// create student
		Student one = new Student ("John", "Doe", 0001);
		// add credits
		one.submitGrade(4.0, 4);
		one.submitGrade(3.0, 4);
		one.submitGrade(4.0, 3);
		one.submitGrade(2.0, 4);
		one.submitGrade(3.0, 2);
		assertTrue("GPA not computing properly", one.getGPA()== 3.176);
	}
	
	@Test
	public void AverageGPAtest() {
		// create students
		Student one = new Student ("John", "Doe", 0001);
		Student two = new Student ("Jane", "Doe", 0002);
		// give them GPA's
		one.setGPA(3.756);
		two.setGPA(3.175);
		assertTrue("GPA not averaging properly", one.averageGPA(one, two)== ((3.756 + 3.175)/2.000));
	}
	
	@Test
	public void SetGPAtest() {
		// create students
		Student one = new Student ("John", "Doe", 0001);
		Student two = new Student ("Jane", "Doe", 0002);
		// give them GPA's
		one.setGPA(3.756);
		two.setGPA(3.175);
		assertTrue("GPA not setting properly", one.getGPA() == 3.756);
		assertTrue("GPA Student 2 not setting properly", two.getGPA() == 3.175);
	}
	
	@Test
	public void ComputeGPAtest() {
		// create student
		Student one = new Student ("John", "Doe", 0001);
		// add credits
		one.submitGrade(4, 4);
		one.submitGrade(3, 4);
		one.submitGrade(4, 3);
		one.submitGrade(2, 4);
		one.submitGrade(3, 2);
		System.out.println(one.computeGPA());
		assertTrue("GPA not computing properly", one.computeGPA()== 3.176470588235294);
	}
}
