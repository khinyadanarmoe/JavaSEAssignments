package Service;

import java.io.IOException;

import DA0.VehicleDao;
import Model.Motorcycle;



public class MotorcycleRegistrationSystem extends VehicleRegistrationSystem {


	@Override
	public void getRegisterInfo() throws IOException {

		System.out.print("Does it have side car: ");
		boolean hasSidecar =Boolean.parseBoolean(br.readLine());

		VehicleDao.addVehicle(new Motorcycle(getVehicle().getBrand(),getVehicle().getModel(), hasSidecar));
	}
}
