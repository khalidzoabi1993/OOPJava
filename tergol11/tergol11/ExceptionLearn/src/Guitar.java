public class Guitar extends Instrument {
    private boolean isElectric;
    private int strings;

    public Guitar(int serialNumber, double price, String color, double weight, int year, String country, int quantity, boolean isElectric, int strings) {
        super(serialNumber, price, color, weight, year, country, quantity);
        this.isElectric = isElectric;
        this.strings = strings;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Guitar - SN: " + serialNumber + ", Electric: " + isElectric + ", Strings: " + strings;
    }
}