package aggregation_demo;

public class AggregationDemo {

	public static void main(String[] args) {
		// metoda mai explicita
		Engine e1 = new Engine(42);
		Car c1 = new Car("Toyota", e1);
		System.out.println(c1);

		c1 = null;
		System.out.println(c1);
		System.out.println(e1);

		/*
		 * metoda mai scurta, dar nepotrivita pt agregare (dar buna pt compozitie).
		 * Problema e ca in exemplul asta, nu mai putem accesa obiectul de tip Engine
		 * dupa ce executam c2 = null, pentru ca nu mai avem o referinta catre el =>
		 * dispare masina, dispare si motorul => compozitie, NU agregare
		 */
		Car c2 = new Car("Tesla", new Engine(32));
		System.out.println(c2);
		c2 = null;
		System.out.println(c2);
	}

}
