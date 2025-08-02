import java.util.ArrayList;
import java.util.Objects;

public abstract class Instrument {
    protected int serialNumber;
    protected double price;
    protected String color;
    protected double weight;
    protected int year;
    protected String country;
    protected int quantity;
    protected ArrayList<MusicBook> books;

    public Instrument(int serialNumber, double price, String color, double weight, int year, String country, int quantity) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.color = color;
        this.weight = weight;
        this.year = year;
        this.country = country;
        this.quantity = quantity;
        this.books = new ArrayList<>();
    }

    public void addBook(MusicBook b) {
        books.add(b);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Instrument)) return false;
        Instrument other = (Instrument) obj;
        return serialNumber == other.serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    public abstract String toString();
}
