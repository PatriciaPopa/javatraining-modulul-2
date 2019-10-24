package rest_sesiunea_4;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {

		/*
		 * Daca folosim versiunea cu comparator anonim (cea in care definim comparatorul
		 * direct in constructorul lui TreeSet), nu mai avem nevoie de comparatorul
		 * static de mai jos;
		 */

		SortedSet<Integer> defaultSortedSet = new TreeSet<>();

		defaultSortedSet.add(5);
		defaultSortedSet.add(2);
		defaultSortedSet.add(4);
		defaultSortedSet.add(1);

		System.out.println(defaultSortedSet.comparator());// e null daca sunt sortate natural

		System.out.println(defaultSortedSet);

		/* --------------------------------------------------------------------- */

		SortedSet<Integer> decreasingSortedSet = new TreeSet<>(new SortedSetDemo.DescComp());
//		SortedSet<Integer> decreasingSortedSet = new TreeSet<>(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return -(o1 - o2); // descrescator
//			}
//		});

		decreasingSortedSet.add(5);
		decreasingSortedSet.add(2);
		decreasingSortedSet.add(4);
		decreasingSortedSet.add(1);

		System.out.println(decreasingSortedSet.comparator());// e null daca sunt sortate natural

		System.out.println(decreasingSortedSet);

		/* --------------------------------------------------------------------- */

		System.out.println(decreasingSortedSet.first());

		/*
		 * crapa pt ca sunt sortate descrescator, iar noi incercam sa le accesam in
		 * ordine crescatoare
		 */
		// System.out.println(ss.subSet(2, 5));
		System.out.println(decreasingSortedSet.subSet(5, 2));
		System.out.println(decreasingSortedSet.subSet(8, 0));
	}

	static class DescComp implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 < o2) {
				return 1;
			} else if (o1 > o2) {
				return -1;
			}

			return 0;
		}

	}
}
