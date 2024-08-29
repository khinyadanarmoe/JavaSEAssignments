package Assignment5.src.model;

public class Motorcycle extends Vehicle {

	private boolean hasSidecar;

	public Motorcycle() {
	}

	public Motorcycle(String brand, String model, boolean hasSidecar) {
		super(brand, model);
		this.hasSidecar = hasSidecar;
	}

	@Override
	public void displayInfo() {

		System.out.println("Motorcycle brand: " + getBrand());
		System.out.println("Motorcycle model: " + getModel());
		System.out.println("Does it have sidecar: true/false? " + hasSidecar + "\n");

	}

}
