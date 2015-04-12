package fr.unice.polytech.ogl.tdd;


public class Scaling implements Operation {

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

	@Override
	public void processGroup(Group g) {
		for(Widget w: g.getElements()) {
			w.apply(this);
		}
	}
}
