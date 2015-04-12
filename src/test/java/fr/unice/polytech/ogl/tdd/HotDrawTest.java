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

	@Test
	public void translatingRectangle() {
		Rectangle r = new Rectangle(5, 6, 10, 8);
		int oldX1 = r.getX1();
		int oldY1 = r.getY1();
		int oldX2 = r.getX2();
		int oldY2 = r.getY2();

		r.translate(2, 3);
		assertEquals(oldX1 + 2, r.getX1());
		assertEquals(oldY1 + 3, r.getY1());
		assertEquals(oldX2 + 2, r.getX2());
		assertEquals(oldY2 + 3, r.getY2());
	}

	@Test
	public void translatingCanvas() {
		Circle c = new Circle();
		int cOldX = c.getX();
		int cOldY = c.getY();

		Rectangle r = new Rectangle(5, 6, 10, 8);
		int rOldX1 = r.getX1();
		int rOldY1 = r.getY1();
		int rOldX2 = r.getX2();
		int rOldY2 = r.getY2();

		emptyCanvas.add(c);
		emptyCanvas.add(r);
		emptyCanvas.translate(2, 3);

		assertEquals(cOldX + 2, c.getX());
		assertEquals(cOldY + 3, c.getY());
		assertEquals(rOldX1 + 2, r.getX1());
		assertEquals(rOldY1 + 3, r.getY1());
		assertEquals(rOldX2 + 2, r.getX2());
		assertEquals(rOldY2 + 3, r.getY2());
	}

	@Test
	public void groupingWidgets() {
		Group g = new Group();
		assertEquals(0, g.getNumberOfElements());

		g.add(new Circle());
		g.add(new Rectangle(5, 6, 10, 8));
		assertEquals(2, g.getNumberOfElements());
	}

	@Test
	public void translatingGroup() {
		Group g = new Group();
		g.add(new Circle());
		g.add(new Rectangle(5, 6, 10, 8));
		g.translate(2,3);
		// will be tricky to write ...
	}

}
