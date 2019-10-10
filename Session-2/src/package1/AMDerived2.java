package package1;

import access_modifier_demo.AccessModifiersBase;

public class AMDerived2 extends AccessModifiersBase {
	public static void main(String[] args) {
		AccessModifiersBase am = new AccessModifiersBase();

		System.out.println(am.nr1);

		/*
		 * nu va merge, pt ca AMDerived2 se afla in alt pachet fata de
		 * AccessModifiersBase
		 */
		// System.out.println(am.nr2);

		/*
		 * asta este un exemplu mai tricky. regula spune in felul urmator: membri
		 * protected ai clasei de baza se pot accesa din interiorul claselor derivate
		 * SAU din clase care NU deriva din clasa de baza, dar care se afla in acelasi
		 * pachet cu ea(vezi ProtectedAccessDemo.java). Aici, ne aflam in alt pachet. Am
		 * putea crede ca ne aflam, insa, in clasa derivata. Nu este cazul, pentru ca
		 * noi incercam sa obtinem atributul respectiv printr-o referinta la un
		 * AccessModifiersBase, care NU este o clasa derivata a sine insusi (vezi
		 * exemplul urmator)
		 */
		// System.out.println(am.nr3);

		AccessModifiersBase am1 = new AMDerived2();
		// tot nu va merge, pentru ca referinta e tot de tip AccessModifiersBase
		// System.err.println(am1.nr3);

		AMDerived2 am2 = new AMDerived2();
		System.err.println(am2.nr3);

	}
}
