package book_tracking_app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		List<Book> gregsBooks = createGregsBooks();

		System.out.println(gregsBooks);

		/*
		 * -----------------------------------------------------------------------------
		 */

		doRemoveReturnedBooks(gregsBooks);

		/*
		 * -----------------------------------------------------------------------------
		 */

		List<Book> annesBooks = createAnnesBooks();

		Map<String, List<Book>> map = new HashMap<>();

		map.put("Greg", gregsBooks);
		map.put("Anne", annesBooks);

		/*
		 * -----------------------------------------------------------------------------
		 */

		for (List<Book> books : map.values()) {
			for (Book book : books) {
				if (book.getRating() == 5) {
					System.out.println(book);
				}
			}
		}

	}

	private static void doRemoveReturnedBooks(List<Book> gregsBooks) {
		Iterator it = gregsBooks.iterator();

		while (it.hasNext()) {
			Book b = (Book) it.next();

			/* Fiindca folosim LocalDate, vom compara datele folosind metoda compareTo() */
			if (b.getCurrDate().compareTo(b.getReturnDate()) > 0) {
				it.remove();
			}

		}

		System.out.println(gregsBooks);
	}

	private static List<Book> createGregsBooks() {
		List<Book> gregsBooks = new ArrayList<>();

		gregsBooks.add(new Book("Dan Brown", "Ingeri si demoni", 4, LocalDate.of(2019, 10, 13)));
		gregsBooks.add(new Book("F. Dostoievski", "Crima si pedeapsa", 5, LocalDate.of(2019, 11, 5)));
		gregsBooks.add(new Book("Alexandre Dumas fiul", "Dama cu camelii", 2, LocalDate.of(2019, 8, 16)));
		gregsBooks.add(new Book("Dan Brown", "Origini", 3, LocalDate.of(2019, 12, 7)));
		gregsBooks.add(new Book("Gustave Flaubert", "Madame Bovary", 5, LocalDate.of(2019, 11, 20)));
		return gregsBooks;
	}

	private static List<Book> createAnnesBooks() {
		List<Book> gregsBooks = new ArrayList<>();

		gregsBooks.add(new Book("sds", "sds", 3, LocalDate.of(2019, 10, 13)));
		gregsBooks.add(new Book("iujgh", "szdszz", 1, LocalDate.of(2019, 11, 5)));
		gregsBooks.add(new Book("ghr", "sdas", 2, LocalDate.of(2019, 8, 16)));
		gregsBooks.add(new Book("oiuy", "fds", 5, LocalDate.of(2019, 12, 7)));
		gregsBooks.add(new Book("vsd rb", "sa", 2, LocalDate.of(2019, 11, 20)));
		return gregsBooks;
	}

}
