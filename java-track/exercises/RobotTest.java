import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void testMoveRobotNorth() {
		Robot c = new Robot("test",0,0,1,(byte) 0);
		c.move();
		assertTrue("movement test failed going North on x axis", c.getPosX()==0);
		assertTrue("movement test failed going north on y axis", c.getPosY()==1);
	}
	
	@Test
	public void testMoveRobotEast() {
		Robot c = new Robot("test",0,0,1,(byte) 1);
		c.move();
		assertTrue("movement test failed going East on x axis", c.getPosX()==1);
		assertTrue("movement test failed going East on y axis", c.getPosY()==0);
	}
	
	@Test
	public void testMoveRobotSouth() {
		Robot c = new Robot("test",1,1,1,(byte) 2);
		c.move();
		assertTrue("movement test failed going South on x axis", c.getPosX()==1);
		assertTrue("movement test failed going South on y axis", c.getPosY()==0);
	}
	
	@Test
	public void testMoveRobotWest() {
		Robot c = new Robot("test",1,1,1,(byte) 3);
		c.move();
		assertTrue("movement test failed going West on x axis", c.getPosX()==0);
		assertTrue("movement test failed going West on y axis", c.getPosY()==1);
	}

	@Test
	public void testPosCorrect() {
		Robot c = new Robot("test",0,0,1,(byte) 2);
		c.move();
		assertTrue("position did not correct on x axis", c.getPosX()==0);
		assertTrue("position did not correct on y axis", c.getPosY()==0);
	}
	
	@Test
	public void testRotateLeft() {
		Robot c = new Robot("test",0,0,1,(byte) 1);
		c.rotateLeft();
		assertTrue("rotation failed turning Left", c.getOrientation()== 0);
		
	}
	
	@Test
	public void testRotateRight() {
		Robot c = new Robot("test",0,0,1,(byte) 1);
		c.rotateRight();
		assertTrue("rotation failed turning Right", c.getOrientation()== 2);
		
	}
	
	@Test
	public void testOrientCorrect() {
		Robot c = new Robot("test",0,0,1,(byte) 0);
		c.rotateLeft();
		assertTrue("Orientation failed to correct", c.getOrientation()== 3);
		
	}
}
