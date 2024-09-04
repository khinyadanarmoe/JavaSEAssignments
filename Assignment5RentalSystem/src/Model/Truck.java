package Model;

public class Truck extends Vehicle {

	private double payloadCapacity;

	public Truck(Vehicle vehicle, double payloadCap) {
		super(vehicle);
		this.payloadCapacity = payloadCap;
	}

	public Truck(int id, String brand, String model, double payloadCap, double rentPrice) {
		super(id, brand, model, rentPrice);
		this.payloadCapacity = payloadCap;
	}

	

	@Override
	public void displayInfo() {

		System.out.println("*****Truck*****");
		super.displayInfo();
		System.out.println("payloadCapacity: " + payloadCapacity + "\n");

	}
}
