package comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompDemo {

	public static void main(String[] args) {
		List<ComparableShape> li = new ArrayList<>();
		li.add(new ComparableShape("blue"));
		li.add(new ComparableShape("blue"));
		li.add(new ComparableShape("red"));
		li.add(new ComparableShape("green"));

		System.out.println(li);

		Collections.sort(li);

		System.out.println(li);

		/* -----------------cu Comparator-------------------- */

		List<Shape> li2 = new ArrayList<>();
		li2.add(new Shape("blue"));
		li2.add(new Shape("blue"));
		li2.add(new Shape("yellow"));
		li2.add(new Shape("green"));

		System.out.println(li2);

		Collections.sort(li2, new ShapeComparator());

		System.out.println(li2);

	}

	/*
	 * Daca nu facem acest comparator static, e mult mai dificil sa-l accesam,
	 * pentru ca avem nevoie de o instanta a clasei CompDemo
	 */
	static class ShapeComparator implements Comparator<Shape> {

		@Override
		public int compare(Shape o1, Shape o2) {
			// return o1.getColor().compareTo(o2.getColor());

			/* ca sa sortam in ordine descrescatoare, alfabetic */

			return -o1.getColor().compareTo(o2.getColor());
		}

	}
}
