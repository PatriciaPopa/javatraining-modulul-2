package course1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
	public static void main(String[] args) {
		// deserializing the object
		try {
			SerializableEmployee newEmp = null;

			FileInputStream fis = new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			// cititm obiectul si il convertim la tipul SerializableEmployee, dupa care il
			// asignam variabilei newEmp
			newEmp = (SerializableEmployee) ois.readObject();

			// inchidem streamurile
			ois.close();
			fis.close();

			System.out.println(newEmp);
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
