package access_modifier_demo;

public class AMDerived1 extends AccessModifiersBase {

	/* aici demonstram accesul la campurile protected si package-private */

	public void doSomething() {
		System.out.println(nr1);
		System.out.println(nr2);
		System.out.println(nr3);

		/*
		 * fieldurile private nu sunt accesibile decat din interiorul clasei in care
		 * sunt definite, de asta linia de mai jos nu va compila
		 */
		// System.out.println(nr4);
	}

}
