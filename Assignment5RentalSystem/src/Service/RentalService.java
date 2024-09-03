//package Service;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//import DA0.RentalDao;
//import DA0.VehicleDao;
//import Model.Car;
//import Model.Customer;
//import Model.Motorcycle;
//import Model.Rental;
//import Model.Truck;
//import Model.Vehicle;
//
//public class RentalService {
//
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	private static RentalDao rentalDao;
//	VehicleRegistrationSystem vehicleRegistrationSystem;
//	Vehicle vehicle;
//	Rental rental;
//	Customer customer;
//
//	public RentalService() {}
//	
//	public RentalService(String type) {
//		
//		vehicleRegistrationSystem= new VehicleRegistrationSystem();
//		rentalDao = new RentalDao();
//		this.rental = new Rental();
//
//		if (type.equalsIgnoreCase("car")) {
//			this.vehicle = new Car();
//		} else if (type.equalsIgnoreCase("truck")) {
//			this.vehicle = new Truck();
//		} else if (type.equalsIgnoreCase("motorcycle")) {
//			this.vehicle = new Motorcycle();
//		}
//	}
//
//	public void getRentInfo() throws IOException {
//
//
//		System.out.print("Rental price: ");
//		vehicle.setRentalPrice(Double.parseDouble(br.readLine()));
//
//		System.out.print("Rental period: ");
//		rental.setRentalPeriod(Integer.parseInt(br.readLine()));
//		
//		rental.setVehicle(vehicle);
//		
//		rental = new Rental(customer, vehicle, rental.getRentalPeriod(), rental.getTotalPrice());
//		rentalDao.create(rental);
//	}
//	
//	
//	
//
//}
