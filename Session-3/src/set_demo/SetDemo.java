package set_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("1");
		set.add("2");
		set.add("1");

		String str = "blabla";
		set.add(str);

		/* ---------------------------------------------------------------------- */

		System.out.println(set);

		/* ---------------------------------------------------------------------- */

		System.out.println(set.size());

		/* ---------------------------------------------------------------------- */

		System.out.println(set.isEmpty());

		/* ---------------------------------------------------------------------- */

		set.remove("1");
		set.remove(str);
		System.out.println(set);

		/* ---------------------------------------------------------------------- */

		Iterator it = set.iterator();

		/* ---------------------------------------------------------------------- */

		Set<String> set1 = new HashSet<>();
		set1.add("1");
		set1.add("gg");
		set1.add("abc");

		System.out.println("set= " + set);
		System.out.println("set1= " + set1);

		/* ---------------------------------------------------------------------- */

		System.out.println(set.containsAll(set1));

		/* ---------------------------------------------------------------------- */

		set.addAll(set1);
		System.out.println("set= " + set);
		System.out.println("set1= " + set1);

		/* ---------------------------------------------------------------------- */

		set.add("gg");
		set.retainAll(set1);
		System.out.println("set= " + set);
		System.out.println("set1= " + set1);

		/* ---------------------------------------------------------------------- */

		set.removeAll(set1);
		System.out.println("set= " + set);
		System.out.println("set1= " + set1);

	}

}
