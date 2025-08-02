public class Truck extends Vehicle {

    public Truck(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void drive() {
        System.out.println("Driving a truck with plate: " + licensePlate);
    }
}
