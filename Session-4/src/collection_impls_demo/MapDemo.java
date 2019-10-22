package collection_impls_demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "b");
		map.put(null, "c");
		map.put(3, "a");
		map.put(4, null);
		map.put(5, null);

		/* inlocuieste valoara mapata la cheia null, cu noua valoare, "x" */

		map.put(null, "x");

		/* ca sa prevenim inlocuirea valorii mapata la cheia duplicata: */

		if (!map.containsKey(null)) {
			System.out.println(map.put(null, "x"));
		}

		/* ---------------------------------------------------- */

		for (String val : map.values()) {
			System.out.println(val);
		}

		System.out.println(map);

		for (Integer key : map.keySet()) {
			System.out.println(key);
		}

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(entry + "; ");
		}

		System.out.println();

		/* ---------------------------------------------------- */

		System.out.println(map.get(2));

		/* ---------------------------------------------------- */

		System.out.println(map.containsValue(-1)); // cititi warningul
		System.out.println(map.containsValue("r"));
		System.out.println(map.containsValue("a"));

		/* ---------------------------------------------------- */
		System.out.println(map.size());

		/* ---------------------------------------------------- */
		System.out.println(map.isEmpty());

		/* ---------------------------------------------------- */
		Map<Integer, String> m = new HashMap<>();
		m.put(99, "haha");

		map.putAll(m);

		System.out.println(map);

		/* ---------------------------------------------------- */
		map.clear();

		System.out.println(map);

	}
}
