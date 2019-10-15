package session2_recap;

public class Circle extends Shape {
	// fielduri si metode specifice clasei Circle

	public Circle(String color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle of color " + color);
	}

}
