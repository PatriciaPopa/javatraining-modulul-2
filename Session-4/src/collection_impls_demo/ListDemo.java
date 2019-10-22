package collection_impls_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		/*
		 * Nu v-am mai incarcat codul cu descrierea fiecarei metode. Tineti cursorul
		 * deasupra numelui metodei si va va aparea descrierea metodei si alte detalii
		 */

		/*
		 * Daca mutati comentul cu o linie mai jos, veti vedea ca si pentru LinkedList,
		 * acelasi operatii sunt valabile
		 */

		// List<Integer> li = new LinkedList<>();
		List<Integer> li = new ArrayList<>();

		li.add(1);
		li.add(3);
		li.add(5);
		li.add(2);
		li.add(-1);
		li.add(4);
		li.add(3);

		System.out.println(li);

		/* ----------------------------------------------- */

		List<Integer> li2 = new ArrayList<>();

		li2.addAll(li);

		System.out.println(li2);

		/* ----------------------------------------------- */

		System.out.println(li.get(1));

		/* Arunca IndexOutOfBoundsException, pentru ca nu avem elementul cu indexul 8 */

		// System.out.println(li.get(8));

		/* ----------------------------------------------- */

		li.set(0, 123);

		System.out.println(li);

		/* ----------------------------------------------- */

		li.remove(3);

		/*
		 * lasati doar 4 simplu si vedeti ce se intampla. Explicatie: metoda remove()
		 * are 2 implementari: una accepta int, iar alta Object; cand ii pasam un numar
		 * intreg, va considera ca apelam metoda remove(int); cand ii pasam un Integer
		 * explicit, se va apela metoda remove(Object); avem acest caz problematic doar
		 * la List<Integer>, pentru ca aici si indecsii si valorile sunt numere intregi
		 */
		li.remove(new Integer(4));

		System.out.println(li);

		/* ----------------------------------------------- */

		/*
		 * In general nu afisam asa o lista, dar asa putem sa parcurgem elementele ei,
		 * ca sa facem ceva cu ele
		 */

//		for (Integer el : li) {
//			System.out.print(el + " ");
//		}

		/* ----------------------------------------------- */
		System.out.println(li.indexOf(5));
		System.out.println(li.indexOf(50440));

		/* ----------------------------------------------- */
		System.out.println(li);

		System.out.println(li.indexOf(3));
		System.out.println(li.lastIndexOf(3));

		/* ----------------------------------------------- */

		System.out.println(li.subList(1, 4));
		System.out.println(li.subList(1, 1));

		/* Astea arunca toate exceptii, pentru ca indecsii dati nu exista */

		// System.out.println(li.subList(-1, 1));
		// System.out.println(li.subList(1, 9));
		// System.out.println(li.subList(4, 1));

		/* ----------------------------------------------- */

		System.out.println(li);

		Collections.sort(li);

		System.out.println(li);

		Collections.reverse(li);

		System.out.println(li);

		/* ----------------------------------------------- */

		/* Am comentat asta pentru ca afecteaza comportamentul print-urilor urmatoare */

//		Collections.shuffle(li);
//
//		System.out.println(li);

		/* ----------------------------------------------- */
		Collections.rotate(li, 2);

		System.out.println(li);

		/* ----------------------------------------------- */
		Collections.replaceAll(li, 3, 111);

		System.out.println(li);

		/* ----------------------------------------------- */

		Collections.sort(li);

		System.out.println(li);

		System.out.println(Collections.binarySearch(li, 5));

		/* ----------------------------------------------- */
		/* Am comentat asta pentru ca afecteaza comportamentul print-urilor urmatoare */

//		List<Integer> li1 = new LinkedList<>();
//
//		Collections.fill(li1, -8);
//
//		System.out.println(li1);
//
//		Collections.fill(li, -8);
//
//		System.out.println(li);

		/* ----------------------------------------------- */

		System.out.println(li);
		System.out.println(Collections.frequency(li, -1));
		System.out.println(Collections.frequency(li, 111));

		/* ----------------------------------------------- */
		List<Integer> li3 = new ArrayList<>(); // incercati sa initializati cu " = null "

		System.out.println(Collections.disjoint(li, li2));
		System.out.println(Collections.disjoint(li, li3));

		/* ----------------------------------------------- */
		System.out.println(Collections.min(li));
		System.out.println(Collections.max(li));

		/* ----------------------------------------------- */
		System.out.println(li);
		Collections.swap(li, 0, 1);
		System.out.println(li);
	}
}
