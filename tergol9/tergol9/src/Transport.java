import java.util.ArrayList;

public class Transport {
    private String lineNumber;
    private int capacity;
    private double currentSpeed;
    private ArrayList<Integer> ratings;

    public Transport(String lineNumber, int capacity, double currentSpeed) {
        this.lineNumber = lineNumber;
        this.capacity = capacity;
        this.currentSpeed = currentSpeed;
        this.ratings = new ArrayList<>();
    }

    public void move() {
        System.out.println("Transport is moving...");
    }

    public void stop() {
        System.out.println("Transport has stopped.");
    }

    public String getDetails() {
        return "Line: " + lineNumber +
               ", Capacity: " + capacity +
               ", Speed: " + currentSpeed + " km/h";
    }

    public void rate(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.size();
    }

    public String getLineNumber() { return lineNumber; }
    public int getCapacity() { return capacity; }
    public double getCurrentSpeed() { return currentSpeed; }

    @Override
    public String toString() {
        return getDetails() + ", Average Rating: " + getAverageRating();
    }

}
