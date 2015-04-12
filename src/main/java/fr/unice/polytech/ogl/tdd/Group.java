package fr.unice.polytech.ogl.tdd;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Widget> elements = new ArrayList<>();

	public void add(Widget o) { elements.add(o); }

	public int getNumberOfElements() { return elements.size(); }

	public void translate(int deltaX, int deltaY) {
		Operation o = new Translation(deltaX, deltaY);
		for(Widget w: elements) {
			w.apply(o);
		}
	}

	public void scale(int factor) {
		Operation o = new Scaling(factor);
		for(Widget w: elements) {
			w.apply(o);
		}
	}

}
