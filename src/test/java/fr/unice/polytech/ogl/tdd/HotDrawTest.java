package fr.unice.polytech.ogl.tdd;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HotDrawTest {

	private Canvas emptyCanvas;

	@Before
	public void initialize() {
		emptyCanvas = new Canvas();
	}

	@Test
	public void testEmptyCanvas() {
		assertEquals(0, emptyCanvas.getNumberOfElements());
	}

	@Test
	public void testCanvas() {
		emptyCanvas.add(new Circle(10, 20, 5));    // Circle located at (10,20), with radius 5.
		assertEquals(1, emptyCanvas.getNumberOfElements());

		emptyCanvas.add(new Circle());             // Default circle, located at (0,0) with radius 1
		emptyCanvas.add(new Rectangle(5, 6, 10, 8));  // Rectangle with one corner at (5,6) and the second at (10,8)
		assertEquals(3, emptyCanvas.getNumberOfElements());
	}

	@Test
	public void translatingCircle() {
		Circle c = new Circle();
		int oldX = c.getX();
		int oldY = c.getY();

		c.translate(2, 3);
		assertEquals(oldX + 2, c.getX());
		assertEquals(oldY + 3, c.getY());
	}

}
