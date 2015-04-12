package fr.unice.polytech.ogl.tdd;

import org.junit.Test;
import static org.junit.Assert.*;


public class HelloWorldTest {

	@Test
	public void sayHello_test() {
		String oracle = "Hello, Sebastien!";
		String data = HelloWorld.sayHello("Sebastien");
		assertEquals(oracle, data);
	}

}
