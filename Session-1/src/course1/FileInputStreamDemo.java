package course1;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {

		// deschidem un stream de intrare, ca sa putem citit din fisierul input.txt
		FileInputStream fis = new FileInputStream("input.txt");

		/*
		 * acest try{...} finally{...} va aparea in fiecare fisier. Abia la sesiunea 4 o
		 * sa vorbim despre exceptii, dar pana atunci, trebuie doar sa stiti ca il
		 * folosim ca sa ne asiguram ca inchidem stream-ul cand terminam cu el, chiar
		 * daca o exceptie a aparut
		 */
		try {
			// size tine numarul de bytes disponibil pentru a fi cititi
			int size = fis.available();

			for (int i = 0; i < size; i++) {
				/*
				 * Incercati sa stergeti acest (char) si sa rulati codul fara el. Ceea ce veti
				 * vedea vor fi codurile ASCII ale caracterelor. Primul caracter fiind 'T', va
				 * avea codul ASCII 84. Fara aceste coduri, nu am putea lucra cu caractere,
				 * pentru ca nu am sti cum sa le scriem in format binar
				 * 
				 * https://www.ibm.com/support/knowledgecenter/en/SSLTBW_2.3.0/com.ibm.zos.v2r3.
				 * ioaq100/ascii_table_appendix.htm
				 */

				System.out.print((char) fis.read());
			}
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}
}
