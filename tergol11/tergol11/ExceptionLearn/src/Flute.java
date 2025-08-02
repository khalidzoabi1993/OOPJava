public class Flute extends Instrument {
    public Flute(int serialNumber, double price, String color, double weight, int year, String country, int quantity) {
        super(serialNumber, price, color, weight, year, country, quantity);
    }

    public String toString() {
        return "Flute - SN: " + serialNumber;
    }
}