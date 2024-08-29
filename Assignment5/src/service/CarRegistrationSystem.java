package Assignment5.src.service;

import java.io.IOException;

import Assignment5.src.model.Car;

public class CarRegistrationSystem extends VehicleRegistrationSystem {

	public CarRegistrationSystem(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car vehicleInfo() throws IOException {

		System.out.print("Enter number of doors: ");
		int doors = Integer.parseInt(br.readLine());

		Car car = new Car(getVehicle().getBrand(), getVehicle().getModel(), doors);
		return car;

	}

}
