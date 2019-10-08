package course1;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {

		// deschidem un stream de iesire, ca sa putem citit din fisierul input.txt
		FileWriter fw = new FileWriter("output1.txt", true);

		/*
		 * acest try{...} finally{...} va aparea in fiecare fisier. Abia la sesiunea 4 o
		 * sa vorbim despre exceptii, dar pana atunci, trebuie doar sa stiti ca il
		 * folosim ca sa ne asiguram ca inchidem stream-ul cand terminam cu el, chiar
		 * daca o exceptie a aparut
		 */
		try {
			fw.write("hello there");
		} finally {
			if (fw != null) {
				fw.close();
			}
		}
	}
}
