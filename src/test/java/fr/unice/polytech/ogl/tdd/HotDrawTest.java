package fr.unice.polytech.ogl.tdd;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HotDrawTest {

	private Canvas emptyCanvas;
	private Group emptyGroup;
	private Group group;
	private Circle aCircle;
	private Rectangle aRectangle;

	@Before
	public void initialize() {
		emptyCanvas = new Canvas();
		emptyGroup = new Group();
		group = new Group();
		aCircle = new Circle();                  // Default circle, located at (0,0) with radius 1
		aRectangle = new Rectangle(5, 6, 10, 8); // Rectangle with one corner at (5,6) and the second at (10,8)
		group.add(aCircle); group.add(aRectangle);
	}

	@Test
	public void testEmptyCanvas() {
		assertEquals(0, emptyCanvas.getNumberOfElements());
	}

	@Test
	public void testCanvas() {
		emptyCanvas.add(new Circle(10, 20, 5));    // Circle located at (10,20), with radius 5.
		assertEquals(1, emptyCanvas.getNumberOfElements());

		emptyCanvas.add(aCircle);
		emptyCanvas.add(aRectangle);
		assertEquals(3, emptyCanvas.getNumberOfElements());
	}

	@Test
	public void translatingCircle() {
		int oldX = aCircle.getX();
		int oldY = aCircle.getY();

		Operation t = new Translation(2, 3);
		aCircle.apply(t);

		assertEquals(oldX + 2, aCircle.getX());
		assertEquals(oldY + 3, aCircle.getY());
	}

	@Test
	public void translatingRectangle() {
		int oldX1 = aRectangle.getX1();
		int oldY1 = aRectangle.getY1();
		int oldX2 = aRectangle.getX2();
		int oldY2 = aRectangle.getY2();

		Operation t = new Translation(2, 3);
		aRectangle.apply(t);

		assertEquals(oldX1 + 2, aRectangle.getX1());
		assertEquals(oldY1 + 3, aRectangle.getY1());
		assertEquals(oldX2 + 2, aRectangle.getX2());
		assertEquals(oldY2 + 3, aRectangle.getY2());
	}

	@Test
	public void translatingCanvas() {
		int cOldX = aCircle.getX();
		int cOldY = aCircle.getY();
		int rOldX1 = aRectangle.getX1();
		int rOldY1 = aRectangle.getY1();
		int rOldX2 = aRectangle.getX2();
		int rOldY2 = aRectangle.getY2();

		emptyCanvas.add(aCircle);
		emptyCanvas.add(aRectangle);
		emptyCanvas.translate(2, 3);

		assertEquals(cOldX + 2, aCircle.getX());
		assertEquals(cOldY + 3, aCircle.getY());
		assertEquals(rOldX1 + 2, aRectangle.getX1());
		assertEquals(rOldY1 + 3, aRectangle.getY1());
		assertEquals(rOldX2 + 2, aRectangle.getX2());
		assertEquals(rOldY2 + 3, aRectangle.getY2());
	}

	@Test
	public void groupingWidgets() {
		assertEquals(0, emptyGroup.getNumberOfElements());
		assertEquals(2, group.getNumberOfElements());
	}

	@Test
	public void translatingGroup() {
		int cOldX = aCircle.getX();
		int cOldY = aCircle.getY();
		int rOldX1 = aRectangle.getX1();
		int rOldY1 = aRectangle.getY1();
		int rOldX2 = aRectangle.getX2();
		int rOldY2 = aRectangle.getY2();

		Operation o = new Translation(2, 3);
		group.apply(o);

		assertEquals(cOldX + 2, aCircle.getX());
		assertEquals(cOldY + 3, aCircle.getY());
		assertEquals(rOldX1 + 2, aRectangle.getX1());
		assertEquals(rOldY1 + 3, aRectangle.getY1());
		assertEquals(rOldX2 + 2, aRectangle.getX2());
		assertEquals(rOldY2 + 3, aRectangle.getY2());
	}

	@Test
	public void testScaling(){
		int oldRadius = aCircle.radius();
		int oldWidth = aRectangle.width();
		int oldHeight = aRectangle.height();

		Operation o = new Scaling(2);
		group.apply(o);

		assertEquals(2*oldRadius, aCircle.radius());
		assertEquals(2*oldWidth, aRectangle.width());
		assertEquals(2*oldHeight, aRectangle.height());

	}

	@Test
	public void testApplyOperationOnWidget(){
		Operation o = new Scaling(2);

		int oldRadius = aCircle.radius();
		o.processCircle(aCircle);
		assertEquals(2*oldRadius, aCircle.radius());

		int oldWidth = aRectangle.width();
		int oldHeight = aRectangle.height();
		o.processRectangle(aRectangle);
		assertEquals(2 * oldWidth, aRectangle.width());
		assertEquals(2*oldHeight, aRectangle.height());
	}

}
