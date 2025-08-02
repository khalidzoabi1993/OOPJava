public class Taxi extends Transport {
    private String driverName;
    private String licensePlate;



    private boolean isAvailable;

    public Taxi(String lineNumber, int capacity, double currentSpeed,
                String driverName, String licensePlate, boolean isAvailable) {
        super(lineNumber, capacity, currentSpeed);
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.isAvailable = isAvailable;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }
    @Override
    public void move() {
        System.out.println("Taxi driven by " + driverName + " is moving...");
    }

    @Override
    public String getDetails() {
        return super.getDetails() +
               ", Driver: " + driverName +
               ", License Plate: " + licensePlate +
               ", Available: " + isAvailable;
    }


    public void toggleAvailability() {

        if(this.getisAvailable() == true){
            this.isAvailable = false;
        }else{
            this.isAvailable = true;
        }
    }
}
