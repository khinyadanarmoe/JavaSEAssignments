package Service;

import java.io.IOException;

import DA0.VehicleDao;
import Model.Truck;



public class TruckRegistrationService extends VehicleRegistrationService {



	@Override
	public void getSpecificInfo() throws IOException {

		System.out.print("Enter payload capacity: ");
		Double payloadCap = Double.parseDouble(br.readLine());

		VehicleDao.addVehicle(new Truck(getVehicle().getVehicleId(), getVehicle().getBrand(),getVehicle().getModel(), payloadCap, getVehicle().getRentalPrice()));
	}

}
