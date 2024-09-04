package Service;

import java.io.IOException;

import DA0.VehicleDao;
import Model.Car;



public class CarRegistrationService extends VehicleRegistrationService {


	@Override
	public void getSpecificInfo() throws IOException {

		System.out.print("Enter number of doors: ");
		int doors = Integer.parseInt(br.readLine());


		VehicleDao.addVehicle(new Car(getVehicle().getVehicleId(), getVehicle().getBrand(),getVehicle().getModel(), doors, getVehicle().getRentalPrice()));

	}

}
