package fr.unice.polytech.ogl.tdd;

import fr.unice.polytech.ogl.tdd.operations.Operation;
import fr.unice.polytech.ogl.tdd.widgets.Group;
import fr.unice.polytech.ogl.tdd.widgets.Widget;

public class Canvas {

	private Group group = new Group();

	public int getNumberOfElements() {
		return group.getNumberOfElements();
	}

	public void add(Widget o) {
		group.add(o);
	}

	public void apply(Operation o) {
		group.apply(o);
	}

}
