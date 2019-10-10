package package1;

public class Derived extends Base {

	@Override
	public void doOverrideExample() {
		System.out.println("O_DERIVED");
	}

	public static void doHidingExample() {
		System.out.println("H_DERIVED");
	}

	public void doSomething() {
		// apelul fara prefix, si cel cu "this" inainte fac acelasi lucru: cheama metoda
		// din clasa derivata
		doOverrideExample(); // base
		this.doOverrideExample(); // derived

		// apelul cu "super" cheama metoda din clasa de baza
		super.doOverrideExample(); // base
	}

	public static void main(String[] args) {
		Base ba2 = new Base();
		Base ba1 = new Derived();
		Derived der = new Derived();

		der.doOverrideExample(); // o_derived
		ba1.doOverrideExample(); // o_derived
		ba2.doOverrideExample(); // o_base

		der.doHidingExample(); // h_derived
		ba1.doHidingExample(); // h_base
		ba2.doHidingExample(); // h_base

		/*
		 * Modul corect de a ne asigura ca accesam metoda dorita. De altfel, liniile de
		 * mai sus au si warninguri care ne avertizeaza despre acest lucru
		 */
		Derived.doHidingExample();
		Base.doHidingExample();

		der.doSomething();
	}
}
