package course1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {

		// deschidem un stream de intrare, ca sa putem citit din fisierul input.txt
		FileReader fr = new FileReader("input.txt");

		int c;

		/*
		 * acest try{...} finally{...} va aparea in fiecare fisier. Abia la sesiunea 4 o
		 * sa vorbim despre exceptii, dar pana atunci, trebuie doar sa stiti ca il
		 * folosim ca sa ne asiguram ca inchidem stream-ul cand terminam cu el, chiar
		 * daca o exceptie a aparut
		 */
		try {
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		} finally {
			if (fr != null) {
				fr.close();
			}
		}
	}
}
