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

		// -----------------------------------------------------------------------

		System.out.println("Demo metoda equals():");

		String s1 = "abc";
		String s2 = s1;
		/*
		 * new creaza tot timpul un nou obiect; daca puneam si aici doar "abc", cele 3
		 * referinte pointau catre acelasi obiect.
		 */
		String s3 = new String("abc");

		System.out.println("s1 == s2 => " + (s1 == s2));
		System.out.println("s1 == s3 => " + (s1 == s3));

		System.out.println("s1.equals(s2) => " + s1.equals(s3));
		System.out.println("s1.equals(s3) => " + s1.equals(s3));

		Circle sh1 = new Circle("blue");
		Shape sh2 = sh1;
		Shape sh3 = new Circle("blue");
		Shape sh4 = new Triangle("blue");

		/*
		 * Noi am spus ca daca avem acelasi tip de figura geometrica, si de aceeasi
		 * culoare, cele doua obiecte se considera identice. Dar == compara daca cele
		 * doua referinte pointeaza la acelasi obiect in memorie, asa ca nu ne ajuta la
		 * ce vrem noi. De asta am suprascis metoda equals.
		 */
		System.out.println("sh1 == sh2 => " + (sh1 == sh2));
		System.out.println("sh1 == sh3 => " + (sh1 == sh3));

		System.out.println("sh1.equals(sh2) => " + sh1.equals(sh3));
		/*
		 * Observati, de asemenea, ca nu conteaza daca comparam o referinta de tip Shape
		 * si una de tip Circle, atata timp cat ambele pointeaza la aceeasi forma, de
		 * aceeasi culoare
		 */
		System.out.println("sh1.equals(sh3) => " + sh1.equals(sh3));
		System.out.println("sh1.equals(sh4) => " + sh1.equals(sh4));

	}
}
