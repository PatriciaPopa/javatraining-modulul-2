package course1;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {

		// deschidem un stream de iesire, ca sa putem citit din fisierul input.txt
		FileOutputStream fos = new FileOutputStream("output.txt");

		/*
		 * acest try{...} finally{...} va aparea in fiecare fisier. Abia la sesiunea 4 o
		 * sa vorbim despre exceptii, dar pana atunci, trebuie doar sa stiti ca il
		 * folosim ca sa ne asiguram ca inchidem stream-ul cand terminam cu el, chiar
		 * daca o exceptie a aparut
		 */
		try {
//			fos.write('h');
//			fos.write('i');
//			fos.write('!');

			// Putem scrie si caracter cu caracter, ca mai sus, dar varianta indicata este
			// urmatoarea:
			String str = "Holla!";
			byte[] strToBytes = str.getBytes();
			fos.write(strToBytes);

		} finally {
			if (fos != null) {
				fos.close();
			}
		}
	}
}
