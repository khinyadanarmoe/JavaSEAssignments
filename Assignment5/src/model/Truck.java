package Assignment5.src.model;

public class Truck extends Vehicle {

	private double payloadCapacity;

	public Truck() {
	}

	public Truck(String brand, String model, double payloadCap) {
		super(brand, model);
		this.payloadCapacity = payloadCap;
	}

	@Override
	public void displayInfo() {

		System.out.println("Truck brand: " + getBrand());
		System.out.println("Truck model: " + getModel());
		System.out.println("payloadCapacity: " + payloadCapacity + "\n");

	}
}
