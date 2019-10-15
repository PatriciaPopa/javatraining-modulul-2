package object_class_demo;

public class ObjectClassDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		/*
		 * Ruland codul de mai jos, veti vedea ca cele doua instructiuni afiseaza
		 * acelasi lucru
		 */
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());

		/* ---------------------------------------------------------------------- */

		System.gc(); // acest call, la randul lui, apeleaza metoda finalize()

		/* ---------------------------------------------------------------------- */

		Object o = new Object();
		String str = "blabla";

		System.out.println(o.getClass());
		System.out.println(str.getClass());

		System.out.println(o.getClass().getName());
		System.out.println(str.getClass().getName());

		/* ---------------------------------------------------------------------- */

		// demo clone drawbacks
		CloneableObject co1 = new CloneableObject("Version1", 1, new CloneableObject("Version11", 11, null));
		CloneableObject co2 = (CloneableObject) co1.clone();

		System.out.println("Inainte de modificari: ");
		System.out.println(co1);
		System.out.println(co2);

		/*
		 * Nota: acelasi lucru s-ar intampla si daca am inlocui co2 cu co1, pe
		 * urmatoarele 4 linii
		 */
		co2.str = "Version2";
		co2.num = 2;
		co2.co.str = "Version22";
		co2.co.num = 22;

		System.out.println("Dupa modificari: ");
		System.out.println(co1);
		System.out.println(co2);
	}
}

/*
 * ca sa putem clona obiectul, trebuie ca tipul pe care dorim sa-l clonam sa
 * implementeze interfata Cloneable
 */
class CloneableObject implements Cloneable {
	public String str;
	public int num;
	public CloneableObject co;

	public CloneableObject(String str, int num, CloneableObject co) {
		super();
		this.str = str;
		this.num = num;
		this.co = co;
	}

	@Override
	public String toString() {
		return "CloneableObject [str=" + str + ", num=" + num + ", co=" + co + "]";
	}

	/*
	 * Daca am comenta metoda de mai jos, codul nu ar mai compila. Asta e din cauza
	 * ca, nemaiavand varianta suprascrisa, care se cheama prin polimorfism, se va
	 * chema cea din clasa Object, care nu este vizibila
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Cloning...");
		return super.clone();
	}

}
