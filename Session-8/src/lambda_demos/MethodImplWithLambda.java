package lambda_demos;

@FunctionalInterface // It is optional
interface Drawable1 {
	public void draw();
}

public class MethodImplWithLambda {
	public static void main(String[] args) {

		// with lambda
		Drawable1 d2 = () -> {
			System.out.println("Drawing1...");
		};

		d2.draw();

	}
}