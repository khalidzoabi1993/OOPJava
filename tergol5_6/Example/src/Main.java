//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(2020, "CHR");
        Car car = new Car(2021, "Toyota", 4);

        vehicle.printInfo();
        car.printInfo();

        car.honk();



    }
}