package composition_demo;

public class CompositionDemo {
	public static void main(String[] args) {
		Company c1 = new Company("Nokia"); // primul constructor
		Company c2 = new Company("IBM", new Department("dept2")); // al doilea constructor
		Company c3 = new Company("Lasting", new Department("soft"), new Department("hardware")); // al treilea
																									// constructor

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

		/*
		 * Cand apelam al treilea constructor, comportamentul lui va inlocui valoarea
		 * default pentru campul dept1. Asta se intampla pentru ca ordinea crearii
		 * elementelor dintr-o clasa este urmatoarea:
		 */

		/*
		 * 1) Campuri si blocuri statice (cand se incarca clasa(classloading). Clasa se
		 * incarca doar daca este folosita, si in aceasta situatie, acest cod se ruleaza
		 * chiar si inaintea metodei main!) - NU este cazul aici
		 */

		/*
		 * 2) Assignment-uri de variable ne-statice si instance blocks (dept1 este un
		 * camp care primeste astfel o valoare)
		 */

		/*
		 * 3) Constructorul
		 */

		/*
		 * Deci, fiindca constructorul ruleaza ultimul, el va suprascrie initializarea
		 * de variabila facuta in clasa Company
		 */
	}
}
