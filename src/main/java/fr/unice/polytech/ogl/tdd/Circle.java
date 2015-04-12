package fr.unice.polytech.ogl.tdd;


public class Circle implements Widget {

	private int x, y, r;

	public Circle() { this(0, 0, 1); }

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() { return x; }
	public int getY() { return y; }

	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }

	public int radius() { return r; }
	public void setRadius(int radius) { this.r = radius; }

	@Override
	public void translate(int deltaX, int deltaY) {
		this.x = x + deltaX;
		this.y = y + deltaY;
	}

	@Override
	public void apply(Operation o) { o.processCircle(this); }
}
