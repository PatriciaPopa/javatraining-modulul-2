package exception_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchMoreExceptionsDemo {
	public static void main(String[] args) {
		/*
		 * observati ca daca o instructiune din try arunca o exceptie, chiar si daca o
		 * prindem, codul din try, de dupa acea linie nu va mai fi executat; de aceea, e
		 * bine sa punem in try strict codul care ar putea arunca o exceptie, iar restul
		 * sub try-catch-finallly)
		 */

		try {
			System.out.println("hello");
			throwCheckedException();
			System.out.println("world");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("&&&");
		} catch (NullPointerException e) {

		} finally {
			System.out.println("in finally");
		}

		System.out.println("the end");
	}

	public static void throwCheckedException() throws FileNotFoundException, NullPointerException {
		FileInputStream fis = new FileInputStream("inp.txt");
	}
}
