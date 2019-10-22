package comparable_and_comparator;

public class Shape {
	private String color;

	public String getColor() {
		return color;
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

}