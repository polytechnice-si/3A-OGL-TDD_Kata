package fr.unice.polytech.ogl.tdd;


public class Rectangle implements Widget {

	private int x1, y1, x2, y2;

	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1; this.y1 = y1;
		this.x2 = x2; this.y2 = y2;
	}

	public int getX1() { return x1;	}
	public int getY1() { return y1;	}
	public int getX2() { return x2;	}
	public int getY2() { return y2; }

	public int width()  { return Math.abs(x2 - x1); }
	public int height() { return Math.abs(y2 - y1); }

	@Override
	public void translate(int deltaX, int deltaY) {
		this.x1 = x1 + deltaX; this.y1 = y1 + deltaY;
		this.x2 = x2 + deltaX; this.y2 = y2 + deltaY;
	}

	@Override
	public void scale(int factor) {
		this.x1 = x1 * factor; this.x2 = x2 * factor;
		this.y1 = y1 * factor; this.y2 = y2 * factor;
	}
}
