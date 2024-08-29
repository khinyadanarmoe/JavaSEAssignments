package Model;

public abstract class Vehicle {

	private String brand;
	private String model;

	private static int count;

	public Vehicle() {

	}

	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
		count++;
	}

	public abstract void displayInfo();

	public static int getCount() {
		return count;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

}
