package fr.unice.polytech.ogl.tdd;


import org.junit.Test;
import static org.junit.Assert.*;

public class HotDrawTest {

	@Test
	public void testEmptyCanvas() {
		Canvas c = new Canvas();
		assertEquals(0, c.getNumberOfElements());
	}

}
