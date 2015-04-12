package fr.unice.polytech.ogl.tdd;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Widget> elements = new ArrayList<>();

	public void add(Widget o) { elements.add(o); }

	public int getNumberOfElements() { return elements.size(); }

	public void translate(int deltaX, int deltaY) {
		for(Widget w: elements) {
			w.translate(deltaX, deltaY);
		}
	}

	public void scale(int factor) {
		for(Widget w: elements) {
			w.scale(factor);
		}
	}

}
