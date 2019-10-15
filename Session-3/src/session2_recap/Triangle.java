package session2_recap;

public class Triangle extends Shape {
	// fielduri si metode specifice clasei Triangle

	public Triangle(String color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Triangle of color " + color);
	}
}
