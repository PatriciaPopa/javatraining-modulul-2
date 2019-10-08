package anotherpackage_course1;

//asta e pentru importul clasic
//import course1.PublicClass;

//astea sunt pentru importul static
import static course1.PublicClass.numStatic;
import static course1.PublicClass.PI;
import static course1.PublicClass.doSomething;

//din moment ce in cazul de fata importam toti membri statici ai clasei, putem sa ii importam pe toti astfel:
import static course1.PublicClass.*;

/*
 * Aici facem un mic demo pentru partea de Import static din curs
 */
public class StaticImportDemo {

	public static void main(String[] args) {

//		// System.out.println(PublicClass.num); /* nu merge, pt ca e ne-static si nu poate fi accesat decat cu o instanta a clasei */
//		System.out.println(PublicClass.numStatic);
//		System.out.println(PublicClass.PI);
//		PublicClass.doSomething();

		/*
		 * Putem accesa si membri statici la fel cum ii accesam pe cei nestatici, dar nu
		 * e indicat
		 */
//		PublicClass pc = new PublicClass();
//		System.out.println(pc.num); // acum merge
//		System.out.println(pc.numStatic);
//		System.out.println(pc.PI);
//		pc.doSomething();

		/*
		 * Asta e importul static. E util cand accesam frecvent membri statici ai unei
		 * clase
		 */

		// referinte statice
		System.out.println(numStatic);

		// constante statice
		System.out.println(PI);

		// metode statice
		doSomething();
	}
}
