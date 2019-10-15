package session2_recap;

public abstract class Shape {
	protected String color;

	public String getColor() {
		return color;
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public abstract void draw();

}
