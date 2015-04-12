package fr.unice.polytech.ogl.tdd.operations;


import fr.unice.polytech.ogl.tdd.widgets.Circle;
import fr.unice.polytech.ogl.tdd.widgets.Rectangle;

public class Scaling extends Operation {

	private int factor;

	public Scaling(int factor) {
		this.factor = factor;
	}

	@Override
	public void processCircle(Circle c) {
		c.setRadius(c.radius() * factor);
	}

	@Override
	public void processRectangle(Rectangle r) {
		r.setX1(r.getX1() * factor);
		r.setX2(r.getX2() * factor);
		r.setY1(r.getY1() * factor);
		r.setY2(r.getY2() * factor);
	}

}