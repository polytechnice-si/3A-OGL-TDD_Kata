package fr.unice.polytech.ogl.tdd.operations;


import fr.unice.polytech.ogl.tdd.widgets.Circle;
import fr.unice.polytech.ogl.tdd.widgets.Group;
import fr.unice.polytech.ogl.tdd.widgets.Rectangle;
import fr.unice.polytech.ogl.tdd.widgets.Widget;

public abstract class Operation {

	public abstract void processCircle(Circle c);

	public abstract void processRectangle(Rectangle r);

	public final void processGroup(Group g) {
		for(Widget w: g.getElements()) {
			w.apply(this);
		}
	}
}
