package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Vehicle;

public class VehicleRegistrationSystem {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Vehicle vehicle;

	public VehicleRegistrationSystem() {		

	}
	
	public void getVehicleInfo() throws IOException {
		System.out.print("Brand: ");
		String brand = br.readLine();

		System.out.print("Model: ");
		String model = br.readLine();

		vehicle = new Vehicle(brand, model);

		getRegisterInfo();
	}
	
	
	
	public void getRegisterInfo() throws IOException {}
	


	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
