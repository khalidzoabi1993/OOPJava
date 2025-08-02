import java.util.*;

public class TransportManager {
    private ArrayList<Transport> transports;

    public TransportManager() {
        transports = new ArrayList<>();
    }

    public void addTransport(Transport t) {
        if (!transports.contains(t)) {
            transports.add(t);
        } else {
            System.out.println("Duplicate transport not added: " + t.getLineNumber());
        }
    }

    public Transport getFastestTransport() {
        if (transports.isEmpty()) return null;
        Transport fastest = transports.get(0);
        for (Transport t : transports) {
            if (t.getCurrentSpeed() > fastest.getCurrentSpeed()) {
                fastest = t;
            }
        }
        return fastest;
    }

    public Transport getTopRatedTransport() {
        if (transports.isEmpty()) return null;
        Transport top = null;
        double maxRating = -1;
        for (Transport t : transports) {
            double avg = t.getAverageRating();
            if (avg > maxRating) {
                maxRating = avg;
                top = t;
            }
        }
        return top;
    }

    public ArrayList<Transport> getBusesOnly() {
        ArrayList<Transport> buses = new ArrayList<>();
        for (Transport t : transports) {
            if (t instanceof Bus) {
                buses.add(t);
            }
        }
        return buses;
    }

    public void printAllDetails() {
        for (Transport t : transports) {
            System.out.println(t.getDetails());
            System.out.println("toString(): " + t.toString());
            System.out.println();
        }
    }

    public void printDuplicates() {
        for (int i = 0; i < transports.size(); i++) {
            for (int j = i + 1; j < transports.size(); j++) {
                if (transports.get(i).equals(transports.get(j))) {
                    System.out.println("Duplicate found: " + transports.get(i));
                }
            }
        }
    }

    public void sortByCapacity() {
        transports.sort((t1, t2) -> Integer.compare(t2.getCapacity(), t1.getCapacity()));
    }
}
