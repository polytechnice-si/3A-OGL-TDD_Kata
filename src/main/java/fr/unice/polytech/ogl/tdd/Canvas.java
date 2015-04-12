package fr.unice.polytech.ogl.tdd;

import java.util.ArrayList;
import java.util.List;


public class Canvas {

	private List<Object> elements = new ArrayList<>();

	public int getNumberOfElements() {
		return elements.size();
	}

	public void add(Object o) {
		elements.add(o);
	}

	public void translate(int deltaX, int deltaY) { }

}
