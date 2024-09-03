package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import DA0.RentalDao;
import DA0.VehicleDao;
import Model.Vehicle;
import Service.CarRegistrationSystem;
import Service.MotorcycleRegistrationSystem;
import Service.TruckRegistrationSystem;
import Service.VehicleRegistrationSystem;

public class Test {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		// RentalService

		VehicleRegistrationSystem service = new VehicleRegistrationSystem();

		String addCustomer;
		do {

			System.out.print("Enter Vehicle Type (Car/Truck/Motorcycle): ");
			String type = br.readLine();
			if (type.equalsIgnoreCase("Car")) {
				service = new CarRegistrationSystem();
			} else if (type.equalsIgnoreCase("Truck")) {
				service = new TruckRegistrationSystem();
			} else if (type.equalsIgnoreCase("Motorcycle")) {
				service = new MotorcycleRegistrationSystem();
			}

			service.getRentInfo();

			System.out.print("Do you want to add more customer: ");
			addCustomer = br.readLine();

		} while (addCustomer.equalsIgnoreCase("yes"));
		RentalDao.displayAllRental();
		
		
		String flag;
		do {

			service.rentById();
	

			System.out.print("Do you want to add more customer: ");
			flag = br.readLine();

		} while (flag.equalsIgnoreCase("yes"));
		RentalDao.displayAllRental();

	}
}

