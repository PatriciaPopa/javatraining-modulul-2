package ex3_cars;

public class Car {
	private String brand;
	private String model;
	private double profit;

	public Car(String brand, String model, double profit) {
		super();
		this.brand = brand;
		this.model = model;
		this.profit = profit;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getProfit() {
		return profit;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", profit=" + profit + "]";
	}

}
