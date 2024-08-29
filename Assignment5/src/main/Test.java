package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Vehicle;
import Service.CarRegistrationSystem;
import Service.MotorcycleRegistrationSystem;
import Service.TruckRegistrationSystem;
import Service.VehicleRegistrationSystem;


public class Test {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		VehicleRegistrationSystem service = null;
		String flag;
		do {
			System.out.print("What is the vehicle type: car/ truck/ motorcycle? ");
			String type = br.readLine();

			if (type.equalsIgnoreCase("car")) {
				service = new CarRegistrationSystem(type);
			} else if (type.equalsIgnoreCase("truck")) {
				service = new TruckRegistrationSystem(type);
			} else if (type.equalsIgnoreCase("motorcycle")) {
				service = new MotorcycleRegistrationSystem(type);
			}

			service.getVehicleInfo();

			System.out.print("Do you want to add another vehicle: ");
			flag = br.readLine();

		} while (flag.equalsIgnoreCase("yes"));

		for (int i = 0; i < Vehicle.getCount(); i++) {
			VehicleRegistrationSystem.getVehicleDB()[i].displayInfo();
		}

	}

}
