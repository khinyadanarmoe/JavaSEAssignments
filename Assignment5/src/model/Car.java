package Model;

public class Car extends Vehicle {

	private int doors;

	public Car() {
	}

	public Car(String brand, String model, int doors) {
		super(brand, model);
		this.doors = doors;
	}

	@Override
	public void displayInfo() {

		System.out.println("Car brand: " + getBrand());
		System.out.println("Car model: " + getModel());
		System.out.println("Number of doors: " + doors + "\n");

	}

}
