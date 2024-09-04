package DA0;

import Model.Car;
import Model.Motorcycle;
import Model.Truck;
import Model.Vehicle;

public class VehicleDao {

    private static Vehicle[] vehicleDB = new Vehicle[Vehicle.Max_Vehicle_Count];
    private static int vehicleCount = 0;

    static {
        addVehicle(new Car(1, "TOYOTA1", "Sedan", 4, 10000));
        addVehicle(new Truck(2, "TOYOTA2", "Sedan",555, 10000));
        addVehicle(new Car(3, "HONDA1", "Sports",6, 10000));
        addVehicle(new Motorcycle(4, "Mazda1", "Sports", true, 10000));
        addVehicle(new Car(5, "TOYOTA3", "SUV", 6, 10000));
        addVehicle(new Car(6, "TOYOTA4", "ABD", 5, 10000));
        addVehicle(new Truck(7, "HONDA2", "Electric",666, 10000));
        addVehicle(new Truck(8, "HONDA3", "SUV", 666, 10000));
        addVehicle(new Car(9, "TOYOTA5", "Sedan", 4, 10000));
        addVehicle(new Motorcycle(10, "Mazda12", "SUV", false, 10000));
    }

    public static void addVehicle(Vehicle vehicle) {
        if (vehicleCount < Vehicle.Max_Vehicle_Count) {
            vehicleDB[vehicleCount] = vehicle;  
            vehicleCount++; 
        } else {
            System.out.println("Can't add more");
        }
    }

    public static Vehicle findById(int id) {
        for (int i = 0; i < vehicleCount; i++) {  
            if (vehicleDB[i].getVehicleId() == id) {
                return vehicleDB[i];
            }
        }
        return null;
    }

    public static void displayAllVehicle() {
        for (int i = 0; i < vehicleCount; i++) {  
            vehicleDB[i].displayInfo();
            System.out.println("Vehicle ID: " + vehicleDB[i].getVehicleId());
        }
    }

  
}

