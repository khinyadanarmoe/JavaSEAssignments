package Model;

import java.util.Date;

public class Rental {

	public static final int Max_Vehicle_Count = 10000;
	private Customer customer;
	private Vehicle vehicle;

	private int rentDays;
	private static int rentalCount = 0;
	private int id;
	private Date date;
	
	public Rental() {}
	
	public Rental(Customer customer, Vehicle vehicle, int rentDays) {
		this.customer = new Customer();
		this.vehicle = vehicle;
		this.rentDays = rentDays;
		this.date = new Date();
		rentalCount++;
		this.id = rentalCount;
	}
	
	public double getTotalPrice() {
		double price = rentDays * vehicle.getRentalPrice();
		return price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void setRentalPeriod(int rentDays) {
		this.rentDays = rentDays;
	}
	
	public int getRentalPeriod() {
		return rentDays;
	}

	public static int getRentalCount() {
		return rentalCount;
	}

	public int getId() {
		return this.id;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void displayforRent() {
		
		System.out.println("**************************");
		System.out.println("Rent Information:");
		customer.displayCustomerInfo();
		getVehicle().displayInfo();
		String str = "Rental period: " + getRentalPeriod() + "\n";
		str = "Rental price: " + vehicle.getRentalPrice() + "\n";
		str += "Total Price: " + getTotalPrice() + "\n";
		str += "Rent date: " + this.date;
		
		System.out.println(str);
		System.out.println("**************************");
	
	}
}
