package ex3_cars;

import java.util.HashSet;
import java.util.Set;

public class CarDemo {
	public static void main(String[] args) {
		Set<Car> carSales = new HashSet<>();

		carSales.add(new Car("BMW", "X6", 10000.3));
		carSales.add(new Car("Hyunday", "Tucson", 3000));
		carSales.add(new Car("Kia", "Ceed", 1000));
		carSales.add(new Car("Porsche", "Cayenne", 30000));
		carSales.add(new Car("Dacia", "Logan", 1000));

		/* ---------------------------------------------------------------- */

		System.out.println(lookForBMWs(carSales));
	}

	private static String lookForBMWs(Set<Car> carSales) {
		for (Car car : carSales) {
			if (car.getBrand().equals("BMW")) {
				return "Yes, at least a BMW car was sold";
			}
		}

		return "No BMW cars were found";
	}

	// Va urma :)
}
