import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public boolean addVehicle(Vehicle v) {
        // check if the vehicle is already in the list , using equals method from Vehicle class
        for (Vehicle vehicle : vehicles) {
            if (vehicle.equals(v)) {
                System.out.println("The vehicle is already in the list");
                return false;
            }
        }
        vehicles.add(v);
        return true;
    }

    public void testAll() {
        for (Vehicle v : vehicles) {
            v.drive(); // הפעלת המתודה המתאימה לפי סוג העצם בפועל – פולימורפיזם
        }
    }
    // Garage.java – הוספה לקוד הקיים

    public int getVehicleCount() {
        return vehicles.size();
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return vehicles;
    }



}
