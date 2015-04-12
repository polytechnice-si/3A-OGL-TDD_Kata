package fr.unice.polytech.ogl.tdd;

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
