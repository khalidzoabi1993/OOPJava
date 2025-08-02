public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Vehicle car = new Car("CAR-123");
        Vehicle truck = new Truck("TRK-456");
        Vehicle motorcycle = new Motorcycle("MOTO-789");

        garage.addVehicle(car);
        garage.addVehicle(truck);
        garage.addVehicle(motorcycle);

        // הדפסת תוצאה — הפעלת drive() על כל אחד לפי סוגו האמיתי
        garage.testAll();
    }
}


/*
public class Main {
    public static void main(String[] args) {
        Garage g1 = new Garage();
        g1.addVehicle(new Car("CAR-111"));
        g1.addVehicle(new Truck("TRK-333"));

        Garage g2 = new Garage();
        g2.addVehicle(new Motorcycle("MOTO-999"));
        g2.addVehicle(new Truck("TRK-888"));
        g2.addVehicle(new Car("CAR-222"));

        FleetManager manager = new FleetManager();
        manager.addGarage(g1);
        manager.addGarage(g2);

        System.out.println("Total vehicles: " + manager.countAllVehicles());
        System.out.println("Number of trucks: " + manager.countByType("Truck"));

        System.out.println("\nTesting all fleets:");
        manager.testAllFleets();

        System.out.println("\nAll license plates:");
        manager.printAllLicensePlates();
    }
}

* */