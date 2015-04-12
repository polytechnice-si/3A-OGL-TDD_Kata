package fr.unice.polytech.ogl.tdd;


import org.junit.Test;
import static org.junit.Assert.*;

public class HotDrawTest {

	@Test
	public void testEmptyCanvas() {
		Canvas c = new Canvas();
		assertEquals(0, c.getNumberOfElements());
	}

	@Test
	public void testCanvas() {
		Canvas c = new Canvas();
		c.add(new Circle(10, 20, 5));    // Circle located at (10,20), with radius 5.
		assertEquals(1, c.getNumberOfElements());

		c.add(new Circle());             // Default circle, located at (0,0) with radius 1
		c.add(new Rectangle(5,6,10,8));  // Rectangle with one corner at (5,6) and the second at (10,8)
		assertEquals(3, c.getNumberOfElements());
	}

}
