public class Car extends Vehicle{
    private int numDoors;

    public Car(int year, String brand, int numDoors) {
        super(year, brand);
        this.numDoors = numDoors;
    }
    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    public void honk(){
        System.out.println("Beep beep!");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Doors: " + numDoors);
    }
}
