public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void drive() {
        System.out.println("Driving a car with plate: " + licensePlate);
    }
}
