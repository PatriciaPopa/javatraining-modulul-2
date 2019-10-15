package collection_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		/*
		 * Dupa cum vedem cu primul print, o lista neparametrizata nu este in sine
		 * periculoasa.
		 */
		Collection col = new ArrayList();
		col.add(6);
		col.add("myStr");
		col.add(new Object());
		System.out.println(col);

		/* ---------------------------------------------------------------------- */

		/*
		 * Totusi, daca incercam, de exemplu, sa convertim elementele sale la un anumit
		 * tip, riscam sa primim o exceptie, daca obiectele adaugate in acea colectie nu
		 * sunt compatibile cu tipul respectiv
		 */
		for (Object el : col) {
//			System.out.println((String) el);
		}

		/* ---------------------------------------------------------------------- */

		/*
		 * Cum instantiem corect o lista. Incearca sa lasi doar List, in loc de
		 * ArrayList. Vom observa ca nu mai putem instantia lista in acest caz. Asta se
		 * intampla fiindca List este o interfata, iar pentru instantiere, avem nevoie
		 * de una dintre implementarile sale (in acest caz, folosim ArrayList)
		 */
		Collection<Integer> col1 = new ArrayList<>();
		col1.add(1);
		col1.add(2);
		col1.add(3);
		// col1.add("fff"); //nu se poate, pt ca String nu e Integer

		/* Metoda 1 de parcurgere */
		System.out.print("Cu for-each: ");

		for (Integer el : col1) {
			System.out.print(el + " ");
		}

		System.out.println();

		/* Metoda 2 de parcurgere */

		System.out.println(col1);

		/* ---------------------------------------------------------------------- */

		// la ce folosesc iteratorii

		Iterator it = col1.iterator();

		/*
		 * metoda gresita de stergere, pentru ca da peste cap indecsii din
		 * lista(listele, by default, pastreaza elementele in ordinea inserarii)
		 */
//		for (Integer el : col1) {
//			if (el < 3) {
//				col1.remove(el);
//			}
//		}

		while (it.hasNext()) {
			Integer el = (Integer) it.next();
			// tot nu merge, fiindca si asa dam peste cap indecsii
//			if (el < 3) {
//				col1.remove(el);
//			}

			if (el < 3) {
				it.remove(); // metoda corecta de a sterge elemente in timp ce iteram pe o colectie
			}
		}

		System.out.println(col1);

		/* ---------------------------------------------------------------------- */

		Collection<Integer> col2 = new ArrayList<>();
		col2.add(1);
		col2.add(2);
		col2.add(3);

		/*
		 * col2 = {1,2,3}, iar col1 = {3} (dupa modificari), deci col2 contine toate
		 * elementele din col1
		 */
		System.out.println("containsAll = " + col2.containsAll(col1));

		/* ---------------------------------------------------------------------- */

		col2.addAll(col1);
		System.out.println("after addAll(col1): " + col2);

		/* ---------------------------------------------------------------------- */

		col2.retainAll(col1);
		System.out.println("after retainAll(col1): " + col2);

		/* ---------------------------------------------------------------------- */

		col2.removeAll(col1);
		System.out.println("after removeAll(col1): " + col2);

		/* ---------------------------------------------------------------------- */

		col2.add(4);
		col2.add(5);

		/*
		 * am fi putut afisa colectia ca si pana acum, dar am vrut sa vedeti si cum o
		 * convertim intr-un array
		 */
		System.out.println("after adding some new elements and printing as array: " + Arrays.toString(col2.toArray()));
		col2.clear();
		System.out.println("after clear(): " + col2);
	}
}
