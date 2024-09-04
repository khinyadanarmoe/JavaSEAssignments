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

public class RentalRegistrationSystem {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static RentalDao rentalDao;
	VehicleRegistrationSystem vehicleRegistrationSystem;
	Vehicle vehicle;
	Rental rental;
	Customer customer;
	private CustomerRegistrationSystem customerRegistrationSystem;
	private CustomerDao customerDao;

	public RentalRegistrationSystem() {

		customerRegistrationSystem = new CustomerRegistrationSystem();
		vehicleRegistrationSystem = new VehicleRegistrationSystem();

		rentalDao = new RentalDao();
		this.customerDao = new CustomerDao();
		this.customer = new Customer();
	}

	public void getRentInfo() throws IOException {

		customer = customerRegistrationSystem.getCustomerInfo();
		customerDao.create(customer);
//		customer.displayCustomerInfo();
		
		System.out.print("Brand: ");
		String brand = br.readLine();

		System.out.print("Model: ");
		String model = br.readLine();

//		vehicleRegistrationSystem.getRegisterInfo();
		
		System.out.print("Rental price: ");
		double rentalPrice = Double.parseDouble(br.readLine());
		
		vehicle = new Vehicle(brand, model, rentalPrice);

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

}
