package Model;

public class Vehicle {
	
	public static final int Max_Vehicle_Count = 1000;

	private String brand;
	private String model;
	private double rentalPrice;

	private int id;

	private static int count = 0;

	public Vehicle(Vehicle vehicle) {
		this.brand = vehicle.getBrand();
		this.model = vehicle.getModel();

		
	}

	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
		count++;
		id = getCount();
//		System.out.println(id);
	}
	
	public Vehicle(String brand, String model, double rentalPrice) {
		this.brand = brand;
		this.model = model;
		this.setRentalPrice(rentalPrice);

	}

	public void displayInfo() {
		System.out.println("Vehicle brand name = "+ this.brand);
        System.out.println("Vehicle model = "+ this.model);
	}

	public static int getCount() {
		return count;
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

	public int getId() {

		return id;
	}




}
