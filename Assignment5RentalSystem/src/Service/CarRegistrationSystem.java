package Service;

import java.io.IOException;

import DA0.VehicleDao;
import Model.Car;



public class CarRegistrationSystem extends VehicleRegistrationSystem {


	@Override
	public void getRegisterInfo() throws IOException {

		System.out.print("Enter number of doors: ");
		int doors = Integer.parseInt(br.readLine());


		VehicleDao.addVehicle(new Car(getVehicle().getBrand(),getVehicle().getModel(), doors));

	}

}
