package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import DA0.CustomerDao;
import DA0.RentalDao;
import DA0.VehicleDao;
import Model.Customer;
import Model.Rental;
import Model.Vehicle;

public class VehicleRegistrationSystem {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Vehicle vehicle;
	Rental rental;
	Customer customer;
	CustomerRegistrationSystem customerRegistrationSystem;
	RentalDao rentalDao;
	private CustomerDao customerDao;


	public VehicleRegistrationSystem() {
		this.customerRegistrationSystem = new CustomerRegistrationSystem();
		this.rentalDao = new RentalDao();
		this.customerDao = new CustomerDao();
		this.customer = new Customer();
		

	}
	
	public void getVehicleInfo() throws IOException {
		System.out.print("Brand: ");
		String brand = br.readLine();

		System.out.print("Model: ");
		String model = br.readLine();

		vehicle = new Vehicle(brand, model);

		getRegisterInfo();
	}

	public void getRentInfo() throws IOException {
		
		customer = customerRegistrationSystem.getCustomerInfo();

		customerDao.create(customer);
//		customer.displayCustomerInfo();
		getVehicleInfo();

		System.out.print("Rental price: ");
		double rentalPrice = Double.parseDouble(br.readLine());
		vehicle.setRentalPrice(rentalPrice);

		System.out.print("Rental period: ");
		int rentDays = Integer.parseInt(br.readLine());
		
		rental = new Rental(customer, vehicle, rentDays);
		rental.setCustomer(customer);

		rentalDao.create(rental);
	}
	
	public void rentById() throws IOException {
		
		customer = customerRegistrationSystem.getCustomerInfo();
		customerDao.create(customer);
		System.out.print("Which Vehicle (by ID): ");
		int id = Integer.parseInt(br.readLine());
		vehicle = VehicleDao.findById(id);
		
		System.out.print("Rental price: ");
		double rentalPrice = Double.parseDouble(br.readLine());
		vehicle.setRentalPrice(rentalPrice);

		System.out.print("Rental period: ");
		int rentDays = Integer.parseInt(br.readLine());
		
		rental = new Rental(customer, vehicle, rentDays);
		rental.setCustomer(customer);

		rentalDao.create(rental);
		
	}
	
	public void getRegisterInfo() throws IOException {}
	


	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
