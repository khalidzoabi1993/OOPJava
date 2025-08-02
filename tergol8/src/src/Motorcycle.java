public class Motorcycle extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void drive() {
        System.out.println("Riding a motorcycle with plate: " + licensePlate);
    }
}
