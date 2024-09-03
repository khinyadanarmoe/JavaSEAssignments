package DA0;

import Model.Rental;
import Model.Vehicle;

public class RentalDao {

	private static Rental[] rentVehicleDB = new Rental[Rental.Max_Vehicle_Count];

	public void create(Rental rental) {
		rentVehicleDB[Rental.getRentalCount()-1] = rental;
	
	}

	public void delete(Vehicle vehicle) {

	}

	public void update(Vehicle vehicle) {

	}

	public static Rental[] getAll() {
		return rentVehicleDB;
	}

	public Rental findById(int id) {

		for (int i = 0; i < Rental.getRentalCount(); i++) {
			if (rentVehicleDB[i].getId() == id) {
				return rentVehicleDB[i];
			}
		}

		return null;
	}
	
	public static void displayAllRental() {
		for (int i = 0; i < Rental.getRentalCount(); i++) {
			getAll()[i].displayforRent();
		}
	}
}

