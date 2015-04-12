package fr.unice.polytech.ogl.tdd;


public abstract class Operation {

	public abstract void processCircle(Circle c);

	public abstract void processRectangle(Rectangle r);

	public final void processGroup(Group g) {
		for(Widget w: g.getElements()) {
			w.apply(this);
		}
	}
}
