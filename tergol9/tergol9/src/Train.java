public class Train extends Transport {
    private int numberOfWagons;
    private boolean isHighSpeed;

    public Train(String lineNumber, int capacity, double currentSpeed,
                 int numberOfWagons, boolean isHighSpeed) {
        super(lineNumber, capacity, currentSpeed);
        this.numberOfWagons = numberOfWagons;
        this.isHighSpeed = isHighSpeed;
    }

    @Override
    public void move() {
        String type = isHighSpeed ? "High-Speed" : "Regular";
        System.out.println(type + " Train line " + getLineNumber() + " is departing...");
    }

    @Override
    public void stop() {
        System.out.println("Train line " + getLineNumber() + " has reached the station.");
    }

    @Override
    public String getDetails() {
        return super.getDetails() +
               ", Wagons: " + numberOfWagons +
               ", High-Speed: " + isHighSpeed;
    }
}
