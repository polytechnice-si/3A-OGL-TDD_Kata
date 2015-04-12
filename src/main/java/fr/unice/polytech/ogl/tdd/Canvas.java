package fr.unice.polytech.ogl.tdd;

import java.util.ArrayList;
import java.util.List;


public class Canvas {

	private List<Widget> elements = new ArrayList<>();

	public int getNumberOfElements() {
		return elements.size();
	}

	public void add(Widget o) {
		elements.add(o);
	}

	public void translate(int deltaX, int deltaY) {
		for(Widget w: elements) {
			w.translate(deltaX, deltaY);
		}
	}

}
