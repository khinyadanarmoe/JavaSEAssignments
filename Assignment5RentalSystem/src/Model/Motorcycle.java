package Model;

public class Motorcycle extends Vehicle {

	private boolean hasSidecar;

	public Motorcycle( Vehicle vehicle, boolean hasSidecar) {
		super(vehicle);
		this.hasSidecar = hasSidecar;
	}

	public Motorcycle(int id, String brand, String model, boolean hasSidecar, double rentPrice) {
		super(id, brand, model, rentPrice);
		this.hasSidecar = hasSidecar;
	}
	

	@Override
	public void displayInfo() {

		System.out.println("*****Motorcycle*****");
		super.displayInfo();
		System.out.println("Does it have sidecar: true/false? " + hasSidecar + "\n");

	}

}
