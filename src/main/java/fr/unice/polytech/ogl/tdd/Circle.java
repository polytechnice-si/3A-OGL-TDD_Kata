package fr.unice.polytech.ogl.tdd;


public class Circle {

	private int x, y;

	public Circle() { this(0, 0, 1); }

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
	}

	public int getX() { return x; }
	public int getY() { return y; }

	public void translate(int deltaX, int deltaY) {
		this.x = x + deltaX;
		this.y = y + deltaY;
	}

}
