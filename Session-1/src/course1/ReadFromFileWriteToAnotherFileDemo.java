package course1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* asta a fost singurul exercitiu de la cursul 1. Scopul era sa ne folosim de exemplele din FileInputStream.java si
 *  FileOutputStream.java ca sa scriem continutul fisierului de input in fisierul de output
 *  */

public class ReadFromFileWriteToAnotherFileDemo {
	public static void main(String[] args) throws IOException {

		/*
		 * cream un stream de intrare, ca sa citit din input.txt, si unul de iesire, ca
		 * sa scriem in output2.txt
		 */
		FileInputStream fis = new FileInputStream("input.txt");
		FileOutputStream fos = new FileOutputStream("output2.txt");

		try {

			// size tine numarul de bytes disponibil pentru a fi cititi
			int size = fis.available();

			for (int i = 0; i < size; i++) {
				// de fiecare data cand mai citim un byte din fisierul de input, il scriem
				// in cel de output
				fos.write((char) fis.read());
			}
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}
}
