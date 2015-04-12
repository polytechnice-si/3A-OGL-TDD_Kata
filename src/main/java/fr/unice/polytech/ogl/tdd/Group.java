package fr.unice.polytech.ogl.tdd;

import java.util.ArrayList;
import java.util.List;

public class Group implements Widget {

	private List<Widget> elements = new ArrayList<>();

	public void add(Widget o) { elements.add(o); }

	public int getNumberOfElements() { return elements.size(); }

	public List<Widget> getElements() { return this.elements; }

	@Override
	public void apply(Operation o) { o.processGroup(this);	}

}
