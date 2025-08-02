import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transport> vehicles = new ArrayList<>();

        vehicles.add(new Bus("10", 50, 40, true, 3));
        vehicles.add(new Train("300", 200, 160, 12, true));
        vehicles.add(new Taxi("7", 4, 60, "Alice", "XYZ123", true));
        vehicles.add(new ElectricBike("B1", 1, 25, 85, true));

        for (Transport t : vehicles) {
            t.move();
            System.out.println(t.getDetails());
            t.rate(4);
            t.rate(5);
            t.rate(3);
            System.out.printf("Average Rating: %.2f\n", t.getAverageRating());
            t.stop();
            System.out.println();
        }
    }
}
