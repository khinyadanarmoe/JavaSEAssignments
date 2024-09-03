package DA0;

import Model.Car;
import Model.Motorcycle;
import Model.Rental;
import Model.Truck;
import Model.Vehicle;

public class VehicleDao {

	private static Vehicle[] vehicleDB = new Vehicle[Vehicle.Max_Vehicle_Count];

	private static int vehicleCount = 0;

	static {

		addVehicle(new Car("TOYOTA1", "Sedan", 4));
		addVehicle(new Truck("TOYOTA2", "Sedan", 320.0));
		addVehicle(new Car("HONDA1", "Sports", 6));
		addVehicle(new Motorcycle("Mazda1", "Sports", true));
		addVehicle(new Car("TOYOTA3", "SUV", 5));
		addVehicle(new Car("TOYOTA4", "ABD", 5));
		addVehicle(new Truck("HONDA2", "Electric", 80.0));
		addVehicle(new Truck("HONDA3", "SUV", 750.0));
		addVehicle(new Car("TOYOTA5", "Sedan", 4));
		addVehicle(new Motorcycle("Mazda12", "SUV", false));
	}

	public static void addVehicle(Vehicle vehicle) {
		if (vehicleCount < Vehicle.Max_Vehicle_Count) {
			vehicleDB[vehicleCount] = vehicle;
			vehicleCount++;
		} else {
			System.out.println("Can't add more");
		}
	}

	public void delete(Vehicle vehicle) {

	}

	public void update(Vehicle vehicle) {

	}

	public static Vehicle[] getAll() {
		return vehicleDB;
	}

	public static Vehicle findById(int id) {

		for (int i = 0; i < Vehicle.getCount(); i++) {
			if (vehicleDB[i].getId() == id) {
				return vehicleDB[i];
			}
		}

		return null;
	}

	public static void displayAllVehicle() {
		for (int i = 0; i < vehicleCount; i++) {
			getAll()[i].displayInfo();
		}

	}

}
