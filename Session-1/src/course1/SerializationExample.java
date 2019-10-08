package course1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) {
		// create a SerializableEmployee and set its fields
		SerializableEmployee se = new SerializableEmployee();
		se.name = "Jimmy";
		se.age = 30;
		se.salary = 3000.44f;
		se.cnp = "389283923823";

		// serializing the object
		try {

			// Prin conventie, fisierle ce contin obiecte serializate au extensia ".ser"
			FileOutputStream fos = new FileOutputStream("emp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(se);

			oos.close();
			fos.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
