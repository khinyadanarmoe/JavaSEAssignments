package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Vehicle;

public class VehicleRegistrationService {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Vehicle vehicle;

	public VehicleRegistrationService() {		

	}
	
	public void getVehicleInfo() throws IOException {
		System.out.print("Brand: ");
		String brand = br.readLine();

		System.out.print("Model: ");
		String model = br.readLine();
		
		System.out.print("VehicleID: ");
		int id = Integer.parseInt(br.readLine());
		
		System.out.print("Rental price: ");
		double rentPrice = Double.parseDouble(br.readLine());
		
		vehicle = new Vehicle(id, brand, model, rentPrice);

		getSpecificInfo();
	}
	
	
	
	public void getSpecificInfo() throws IOException {}
	


	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
