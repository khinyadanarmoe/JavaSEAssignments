package Service;

import java.io.IOException;

import DA0.VehicleDao;
import Model.Motorcycle;



public class MotorcycleRegistrationService extends VehicleRegistrationService {


	@Override
	public void getSpecificInfo() throws IOException {

		System.out.print("Does it have side car: ");
		boolean hasSidecar =Boolean.parseBoolean(br.readLine());

		VehicleDao.addVehicle(new Motorcycle(getVehicle().getVehicleId(), getVehicle().getBrand(),getVehicle().getModel(), hasSidecar, getVehicle().getRentalPrice()));
	}
}
