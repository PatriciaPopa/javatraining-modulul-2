package ex3_cars;

public class Car {
	private String brand;
	private String model;
	private double profit;
	private int productionYear;

	public Car(String brand, String model, double profit, int productionYear) {
		super();
		this.brand = brand;
		this.model = model;
		this.profit = profit;
		this.productionYear = productionYear;
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

	public int getProductionYear() {
		return productionYear;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", profit=" + profit + ", productionYear=" + productionYear
				+ "]";
	}

}
