public class ElectricBike extends Transport {
    private int batteryLevel;
    private boolean helmetIncluded;

    public ElectricBike(String lineNumber, int capacity, double currentSpeed,
                        int batteryLevel, boolean helmetIncluded) {
        super(lineNumber, capacity, currentSpeed);
        this.batteryLevel = batteryLevel;
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    public void move() {
        System.out.println("Electric bike is rolling...");
    }

    @Override
    public void stop() {
        System.out.println("Bike parked.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() +
               ", Battery: " + batteryLevel + "%" +
               ", Helmet Included: " + helmetIncluded;
    }
}
