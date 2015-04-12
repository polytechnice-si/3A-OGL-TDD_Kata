package fr.unice.polytech.ogl.tdd;


public interface Widget {

	public void translate(int deltaX, int deltaY);

	public void scale(int factor);

	public void apply(Operation o);

}
