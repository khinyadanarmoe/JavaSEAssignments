package Service;

import java.io.IOException;

import DA0.VehicleDao;
import Model.Truck;



public class TruckRegistrationSystem extends VehicleRegistrationSystem {



	@Override
	public void getRegisterInfo() throws IOException {

		System.out.print("Enter payload capacity: ");
		Double payloadCap = Double.parseDouble(br.readLine());

		VehicleDao.addVehicle(new Truck(getVehicle().getBrand(),getVehicle().getModel(), payloadCap));
	}

}
