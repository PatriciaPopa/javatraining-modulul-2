package package1;

public class CastExampleFaraComments {
	public static void main(String[] args) {

		Object obj = new Object();
		String str = null;

		/*
		 * pentru a converti o instanta a subclasei(String) intr-o instanta a
		 * superclasei(Object), nu e nevoie de cast
		 */

		obj = str;
		obj = "ddd"; // pentru String-uri, putem sa ii pasam direct un literal

		/*
		 * -----------------------------------------------------------------------------
		 */

		Object obj1 = new Object();
		Object os = "This is actually a string";
		String str1 = "Another string";

		/*
		 * pentru ca variabila obj1 referentiaza un obiect de tip Object, inseamna ca nu
		 * stie sa "faca" operatiile specifice tipului String => daca incercam sa
		 * castuim acest obiect la String, programul va arunca ClassCastException; Un
		 * astfel de check ne ajuta sa nu aruncam aceasta exceptie, verificand mai intai
		 * daca avem voie sa facem acest cast
		 */

//		if (obj1 instanceof String) {
//		System.out.println("here");
//			str1 = (String) obj1;
//		}

		/*
		 * desi variabila os este de tip Object, obiectul referentiat este de tip
		 * String, deci il putem castui fara probleme
		 */
		str1 = (String) os;
		// System.out.println(str1);

	}
}
