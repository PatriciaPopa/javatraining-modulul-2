package session2_recap;

public class ShapeDemo {
	public static void main(String[] args) {
		// polimorfism demo
		// Shape sh = new Shape("Red");
		Shape st = new Triangle("Blue");
		Shape sc = new Circle("Yellow");
		Triangle tr = new Triangle("Pink");
		Circle ci = new Circle("Orange");

		// sh.draw();
		st.draw();
		sc.draw();
		tr.draw();
		ci.draw();

		/*
		 * System.out.println(st); cand nu avem toString suprascris, se apeleaza
		 * varianta din clasa Object
		 */

	}
}
