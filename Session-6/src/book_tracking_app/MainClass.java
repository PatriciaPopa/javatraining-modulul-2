package book_tracking_app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("Dan Brown", "Ingeri si demoni", 4, LocalDate.of(2019, 10, 13)));
		books.add(new Book("F. Dostoievski", "Crima si pedeapsa", 5, LocalDate.of(2019, 11, 5)));
		books.add(new Book("Alexandre Dumas fiul", "Dama cu camelii", 2, LocalDate.of(2019, 8, 16)));
		books.add(new Book("Dan Brown", "Origini", 3, LocalDate.of(2019, 12, 7)));
		books.add(new Book("Gustave Flaubert", "Madame Bovary", 5, LocalDate.of(2019, 11, 20)));

		System.out.println(books);

		/*
		 * -----------------------------------------------------------------------------
		 */

		Iterator it = books.iterator();

		while (it.hasNext()) {
			Book b = (Book) it.next();

			/* Fiindca folosim LocalDate, vom compara datele folosind metoda compareTo() */
			if (b.getCurrDate().compareTo(b.getReturnDate()) > 0) {
				it.remove();
			}

		}

		System.out.println(books);

		// Va urma :)
	}
}
