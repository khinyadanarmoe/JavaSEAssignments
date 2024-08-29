package Assignment5_VehicleManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.service.CarRegistrationSystem;
import com.example.service.MotorcycleRegistrationSystem;
import com.example.service.TruckRegistrationSystem;
import com.example.service.VehicleRegistrationSystem;

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
