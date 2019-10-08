package course1;

public class StaticStuffDemo {

	/*
	 * La un membru static, toate instantele clasei respective impart aceeasi copie
	 * a aceluiasi membru (spre deosebire de membrii ne-statici, unde instanta
	 * primeste propia sa copie). Pentru a vedea diferenta, rulati codul de mai jos
	 * asa cum e, apoi stergeti "static" din declaratia variabile counter de mai jos
	 * si rulati din nou
	 * 
	 */

	// Avem 3 tipuri de membri statici:

	// referinte statice
	public static int counter;

	// constante statice
	public static final String msg = "hello";

	// metode statice
	public static void main(String[] args) {
		StaticStuffDemo c1 = new StaticStuffDemo();
		StaticStuffDemo c2 = new StaticStuffDemo();

		c1.counter = 3;

		System.out.println("C1.counter = " + c1.counter);
		System.out.println("C2.counter = " + c2.counter);
	}
}
