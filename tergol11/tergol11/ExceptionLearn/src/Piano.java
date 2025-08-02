public class Piano extends Instrument {
    private boolean isGrand;

    public Piano(int serialNumber, double price, String color, double weight, int year, String country, int quantity, boolean isGrand) {
        super(serialNumber, price, color, weight, year, country, quantity);
        this.isGrand = isGrand;
    }

    public String toString() {
        return "Piano - SN: " + serialNumber + ", Grand: " + isGrand;
    }
}