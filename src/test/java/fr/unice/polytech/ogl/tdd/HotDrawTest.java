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
		c.add(new Circle());
		assertEquals(1, c.getNumberOfElements());

		c.add(new Circle());
		c.add(new Rectangle());
		assertEquals(3, c.getNumberOfElements());
	}

}
