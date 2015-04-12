package fr.unice.polytech.ogl.tdd;

/**
 * This file is part of the tdd-kata project
 *
 * @author mosser (12/04/2015, 13:27)
 */
public class HelloWorld {


	public static void main(String[] args) {
		System.out.println(sayHello("World"));
	}


	public static String sayHello(String name) {
		return "Hello, " + name + "!";
	}


}
