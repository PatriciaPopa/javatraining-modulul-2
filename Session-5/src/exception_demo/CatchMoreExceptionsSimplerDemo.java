package exception_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchMoreExceptionsSimplerDemo {
	public static void main(String[] args) {
		/*
		 * e exact acelasi cod ca in CatchMoreExceptionsDemo.java, doar ca aici folosim
		 * o singura clauza catch ca sa prindem toate exceptiile
		 */

		try {
			System.out.println("hello");
			throwCheckedException();
			System.out.println("world");
		} catch (FileNotFoundException | NullPointerException e) {
			e.printStackTrace();
			System.out.println("&&&");
		} finally {
			System.out.println("in finally");
		}

		System.out.println("the end");
	}

	public static void throwCheckedException() throws FileNotFoundException, NullPointerException {
		FileInputStream fis = new FileInputStream("inp.txt");
	}
}
