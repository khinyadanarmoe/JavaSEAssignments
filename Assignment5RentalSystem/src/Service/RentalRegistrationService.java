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

public class RentalRegistrationService {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private RentalDao rentalDao;
    private VehicleRegistrationService vehicleRegistrationService;
    private CustomerRegistrationService customerRegistrationService;
    private CustomerDao customerDao;

	public RentalRegistrationService() {

		customerRegistrationService = new CustomerRegistrationService();
		vehicleRegistrationService = new VehicleRegistrationService();

		this.rentalDao = new RentalDao();
		this.customerDao = new CustomerDao();
	}

	public void getRentInfo() throws IOException {

		Customer customer = customerRegistrationService.getCustomerInfo();
		customerDao.create(customer);
		customer.displayCustomerInfo();

		vehicleRegistrationService.getVehicleInfo();
		vehicleRegistrationService.getSpecificInfo();

//		vehicle = new Vehicle(brand, model, rentalPrice);

		System.out.print("Rental period: ");
		int rentDays = Integer.parseInt(br.readLine());
		
		Rental rental = new Rental(customer, vehicleRegistrationService.getVehicle(), rentDays);
		rental.setCustomer(customer);

		rentalDao.create(rental);
	}

	public Vehicle getVehicleById() throws IOException {

		System.out.print("Which Vehicle (by ID): ");
		int id = Integer.parseInt(br.readLine());
		Vehicle vehicle = VehicleDao.findById(id);
		
		if (vehicle == null) {
			getVehicleById();
		}
		
		return vehicle;
		

	}

	  public void rentById() throws IOException {
		  
	        Customer customer = customerRegistrationService.getCustomerInfo();
	        customerDao.create(customer);

	        Vehicle vehicle = getVehicleById();
	        System.out.print("Rental period (in days): ");
	        int rentDays = Integer.parseInt(br.readLine());

	        Rental rental = new Rental(customer, vehicle, rentDays);
	        rental.setCustomer(customer);
	        rentalDao.create(rental);
	    }


}
