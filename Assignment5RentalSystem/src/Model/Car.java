package Model;

public class Car extends Vehicle {

	private int door;

	public Car(Vehicle vehicle, int door) {
		
		super(vehicle);
		this.door = door;
	}

	public Car(int id, String brand, String model, int door, double rentalPrice) {
		super(id, brand, model, rentalPrice);
		this.door = door;
		
	}
	

	@Override
	public void displayInfo() {

		System.out.println("*****Car*****");
		super.displayInfo();
		System.out.println("Number of doors: " + this.door + "\n");

	}

}
