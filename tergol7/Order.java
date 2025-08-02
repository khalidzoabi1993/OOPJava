import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int orderNumber;
    private Customer customer;
    private LocalDate orderDate;
    private String status; // "שולם" או "לא שולם"
    private ArrayList<Product> products;

    public Order(int orderNumber, Customer customer, LocalDate orderDate, String status) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.orderDate = orderDate;
        this.status = status;
        this.products = new ArrayList<>();
    }

    public boolean addProductToOrder(Product p) {
        if (products.size() >= 10) return false;
        products.add(p);
        return true;
    }

    public boolean removeProductFromOrder(Product p) {
        // check if the product exists in the products list and remove it
        for (Product product : products) {
            if (product.equals(p)) {
                return products.remove(product);
            }
        }

        return products.remove(p);
    }

    // Getters and Setters...

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Order Number=" + orderNumber +
                ", Customer=" + customer.getFirstName() + " " + customer.getLastName() +
                ", Order Date=" + orderDate +
                ", Status='" + status + '\'' +
                ", Products Count=" + products.size() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;


        return this.orderNumber == other.orderNumber;
    }
}
