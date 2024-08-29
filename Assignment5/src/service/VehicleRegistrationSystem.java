package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Car;
import Model.Motorcycle;
import Model.Truck;
import Model.Vehicle;


public class VehicleRegistrationSystem {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Vehicle[] vehicleDB = new Vehicle[1000];
	private Vehicle vehicle;
	
	public VehicleRegistrationSystem(String type) {
		
		if (type.equalsIgnoreCase("car")) {
			this.vehicle = new Car();
		} else if (type.equalsIgnoreCase("truck")) {
			this.vehicle = new Truck();
		} else if (type.equalsIgnoreCase("motorcycle")) {
			this.vehicle = new Motorcycle();
		} 
		
	}
	
	public void getVehicleInfo() throws IOException {
		
		getCommonInfo();
		vehicle = this.vehicleInfo();
		vehicleDB[Vehicle.getCount()-1] = vehicle;

	}

	public void getCommonInfo() throws IOException {

		System.out.print("Brand: ");
		this.vehicle.setBrand(br.readLine());
		
		System.out.print("model: ");
		this.vehicle.setModel(br.readLine());

	}

	public Vehicle vehicleInfo() throws IOException {
		return null;

	}
	
	public static Vehicle[] getVehicleDB() {
		return vehicleDB;
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}

}

