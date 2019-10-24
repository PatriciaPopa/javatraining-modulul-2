package rest_sesiunea_4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> sm = new TreeMap<>(new DescKeyComparator());

		sm.put(5, "Ion Popescu");
		sm.put(3, "Gica Hagi");
		sm.put(1, "Maria Lupu");
		sm.put(6, "Ioana Popa");

		System.out.println(sm.comparator());
		System.out.println(sm);
	}

	static class DescKeyComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return -(o1 - o2);
		}

	}
}
