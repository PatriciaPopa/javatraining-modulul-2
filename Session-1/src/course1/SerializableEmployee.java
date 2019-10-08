package course1;

import java.io.Serializable;

public class SerializableEmployee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public int age;

	/*
	 * transient inseamna ca nu vrem ca valoarea acestui field sa se persiste prin
	 * serializare, ceea ce inseamna ca la deserializare, va primi valoarea default
	 * pentru tipul sau de date
	 */
	public transient float salary;
	public transient String cnp;

	// folosita ca sa putem afisa in consola o instanta a clasei
	@Override
	public String toString() {
		return "SerializableEmployee [name=" + name + ", age=" + age + ", salary=" + salary + ", cnp=" + cnp + "]";
	}

	// other methods

}
