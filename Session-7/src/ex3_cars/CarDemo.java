package ex3_cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CarDemo {
	public static void main(String[] args) {
		Set<Car> carSales = new HashSet<>();

		carSales.add(new Car("BMW", "X6", 10000.3, 1997));
		carSales.add(new Car("Hyunday", "Tucson", 3000, 2019));
		carSales.add(new Car("Kia", "Ceed", 1000, 2014));
		carSales.add(new Car("Porsche", "Cayenne", 30000, 1997));
		carSales.add(new Car("Dacia", "Logan", 1000, 2006));

		/* ---------------------------------------------------------------- */

		System.out.println(lookForBMWs(carSales));

		/* ----------------------------------------------------------------- */
		// splitByProdYear(carSales);
		splitByProdYearWithMap(carSales);
	}

	private static String lookForBMWs(Set<Car> carSales) {
		for (Car car : carSales) {
			if (car.getBrand().equals("BMW")) {
				return "Yes, at least a BMW car was sold";
			}
		}

		return "No BMW cars were found";
	}

	private static void splitByProdYear(Set<Car> carSales) {
		Set<Integer> prodYears = new HashSet<>();

		carSales.forEach(c -> prodYears.add(c.getProductionYear()));

		List<List<Car>> listOfCarLists = new ArrayList<>();

		for (Integer prodYear : prodYears) {

			List<Car> newList = carSales.stream().filter(c -> {
				return c.getProductionYear() == prodYear;
			}).collect(Collectors.toList());

			listOfCarLists.add(newList);
		}

		listOfCarLists.forEach(currList -> {
			System.out.println("\n" + currList);
		});

	}

	private static void splitByProdYearWithMap(Set<Car> carSales) {
		Map<Integer, List<Car>> map = new HashMap<>();

		for (Car car : carSales) {
			int productionYear = car.getProductionYear();

			if (map.containsKey(productionYear)) {
				List<Car> existingList = map.get(productionYear);

				existingList.add(car);
			} else {
				List<Car> newList = new ArrayList<>();

				map.put(productionYear, newList);

				newList.add(car);
			}
		}

		map.forEach((k, v) -> System.out.println(v));
	}

	private static void getMostProfitableYear(Set<Car> carSales) {
		Set<Integer> prodYears = new HashSet<>();

		carSales.forEach(c -> prodYears.add(c.getProductionYear()));

		List<List<Car>> listOfCarLists = new ArrayList<>();

		for (Integer prodYear : prodYears) {

			List<Car> newList = carSales.stream().filter(c -> {
				return c.getProductionYear() == prodYear;
			}).collect(Collectors.toList());

			listOfCarLists.add(newList);
		}

		listOfCarLists.forEach(currList -> {
			// TODO

//			Double sum = currList.stream().reduce(0.0, Double::sum);
		});

	}

}
