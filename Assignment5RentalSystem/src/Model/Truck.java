package Model;

public class Truck extends Vehicle {

	private double payloadCapacity;

	public Truck(Vehicle vehicle, double payloadCap) {
		super(vehicle);
		this.payloadCapacity = payloadCap;
	}

	public Truck(String brand, String model, double payloadCap) {
		super(brand, model);
		this.payloadCapacity = payloadCap;
	}
	
	public Truck(String brand, String model, double payloadCap, double rentalPrice) {
		super(brand, model);
		this.payloadCapacity = payloadCap;
		this.setRentalPrice(rentalPrice);
	}
	

	@Override
	public void displayInfo() {

		System.out.println("*****Truck*****");
		super.displayInfo();
		System.out.println("payloadCapacity: " + payloadCapacity + "\n");

	}
}
