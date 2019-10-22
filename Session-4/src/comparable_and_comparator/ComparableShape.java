package comparable_and_comparator;

public class ComparableShape implements Comparable {
	private String color;

	public String getColor() {
		return color;
	}

	public ComparableShape(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

	/*
	 * Ca sa stim ce trebuie returnat pentru a sorta crescator sau descrescator,
	 * cititi documentatia metodei compareTo(), tinand cursorul pe ea
	 */
	@Override
	public int compareTo(Object o) {
		if (o instanceof ComparableShape) {
			ComparableShape sho = (ComparableShape) o;

			/*
			 * daca am fi comparat numere, in loc de Stringuri, am fi returnat 0 daca cele
			 * doua erau egale, -1 daca this era mai mic decat sho si 1 daca this era mai
			 * mare decat sho
			 */

			return color.compareTo(sho.color);

			/* ca sa sortam in ordine descrescatoare, alfabetic */

			// return -color.compareTo(sho.color);

		}

		return 0;
	}

}
