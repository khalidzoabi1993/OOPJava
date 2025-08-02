public class Bus extends Transport {
    private boolean isElectric;
    private int numberOfDoors;

    public Bus(String lineNumber, int capacity, double currentSpeed,
               boolean isElectric, int numberOfDoors) {
        super(lineNumber, capacity, currentSpeed);
        this.isElectric = isElectric;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        String type = isElectric ? "Electric" : "Diesel";
        System.out.println(type + " Bus line " + getLineNumber() + " is moving...");
    }

    @Override
    public String getDetails() {
        return super.getDetails() +
               ", Electric: " + isElectric +
               ", Doors: " + numberOfDoors;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bus)) return false;
        Bus other = (Bus) obj;
        return this.numberOfDoors  == other.numberOfDoors ;
    }
}
