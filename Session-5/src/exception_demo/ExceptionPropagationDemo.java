package exception_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPropagationDemo {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("hello");
		handleException();
		System.out.println("world");
	}

	public static void handleException() throws FileNotFoundException {
		/*
		 * daca decomentati apelul de mai jos, veti vedea ca pentru Unchecked Exceptions
		 * compilatorul nu ne obliga sa le tratam nicicum, si nici sa le propagam mai
		 * departe; asta pentru ca ele apar de obicei la runtime si tin cel mai adesea
		 * de greseli in codul programatorului, pe care e greu sa le observe (ex: apelam
		 * o metoda pe un obiect null => NullPointerException)
		 */
//		throwUncheckedException();

		/*
		 * checked exceptions, dupa cum le spune si numele, sunt verificate de
		 * compilator, care ne obliga fie sa le tratam, fie sa le propagam mai departe;
		 * acestea sunt lucruri ce nu tin de aplicatie, dar pe care programatorul le
		 * poate anticipa (ex: daca programul incearca sa citeasca dintr-un fisier care
		 * nu mai exista, va arunca FileNotFoundException)
		 */
		throwCheckedException();
	}

	public static void throwUncheckedException() {
		throw new NullPointerException();
	}

	public static void throwCheckedException() throws FileNotFoundException {
		/*
		 * in loc sa prinda si sa trateze posibila FileNotFoundException, aceasta metoda
		 * decide sa o propage mai departe catre metoda apelanta
		 */
		FileInputStream fis = new FileInputStream("inp.txt");
	}
}
