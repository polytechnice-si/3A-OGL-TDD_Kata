package fr.unice.polytech.ogl.tdd;


public class Translation implements Operation {

	private int deltaX;
	private int deltaY;

	public Translation(int dx, int dy) {
		this.deltaX = dx;
		this.deltaY = dy;
	}

	@Override
	public void processCircle(Circle c) {
		c.setX(c.getX() + deltaX);
		c.setY(c.getY() + deltaY);
	}

	@Override
	public void processRectangle(Rectangle r) {
		r.setX1(r.getX1() + deltaX);
		r.setX2(r.getX2() + deltaX);
		r.setY1(r.getY1() + deltaY);
		r.setY2(r.getY2() + deltaY);
	}
}
