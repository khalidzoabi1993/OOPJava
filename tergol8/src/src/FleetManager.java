import java.util.ArrayList;

public class FleetManager {

    private ArrayList<Garage> garages;

    // בנאי מאתחל את רשימת המוסכים
    public FleetManager() {
        garages = new ArrayList<>();
    }

    // הוספת מוסך חדש לרשימה
    public void addGarage(Garage g) {
        garages.add(g);
    }

    // ספירה כוללת של כל כלי הרכב בכל המוסכים
    public int countAllVehicles() {
        int total = 0;
        for (Garage g : garages) {
            total += g.getVehicleCount(); // נשתמש במתודה עזר ב-Garage (נכתוב בהמשך)
        }
        return total;
    }

    // ספירת רכבים לפי סוג (Car, Truck, Motorcycle)
    public int countByType(String type) {
        int count = 0;
        for (Garage g : garages) {
            for (Vehicle v : g.getAllVehicles()) { // מתודה עזר ב-Garage
                switch (type) {
                    case "Car":
                        if (v instanceof Car && !(v instanceof Motorcycle) && !(v instanceof Truck))
                            count++;
                        break;
                    case "Truck":
                        if (v instanceof Truck)
                            count++;
                        break;
                    case "Motorcycle":
                        if (v instanceof Motorcycle)
                            count++;
                        break;
                }
            }
        }
        return count;
    }

    // הפעלת drive() על כל כלי הרכב בכל המוסכים
    public void testAllFleets() {
        for (Garage g : garages) {
            g.testAll();
        }
    }

    // (רשות) הדפסת כל מספרי הרישוי
    public void printAllLicensePlates() {
        for (Garage g : garages) {
            for (Vehicle v : g.getAllVehicles()) {
                System.out.println(v.getLicensePlate());
            }
        }
    }
}
