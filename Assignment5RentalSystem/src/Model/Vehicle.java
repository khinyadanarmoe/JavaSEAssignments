package Model;

public class Vehicle {

	public static final int Max_Vehicle_Count = 1000;

	private String brand;
	private String model;
	private double rentalPrice;
	private int id;

	public Vehicle(Vehicle vehicle) {
		this.brand = vehicle.getBrand();
		this.model = vehicle.getModel();

	}

	public Vehicle(int id, String brand, String model, double rentalPrice) {
		this.brand = brand;
		this.model = model;
		this.id = id;
		this.rentalPrice = rentalPrice;

	}

	public void displayInfo() {
		System.out.println("Vehicle brand name = " + this.brand);
		System.out.println("Vehicle model = " + this.model);
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public int getVehicleId() {
		return id;
	}

}
