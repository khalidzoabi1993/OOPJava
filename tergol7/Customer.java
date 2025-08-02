import java.util.ArrayList;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String city;
    private ArrayList<Order> orders;


    public Customer(String id, String firstName, String lastName, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.orders = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    // ✅ מתודה להוספת הזמנה ללקוח (מקסימום 5)
    public boolean addOrderToCustomer(Order o) {
        if (orders.size() >= 5) return false;
        orders.add(o);
        return true;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID='" + id + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", City='" + city + '\'' +
                ", Orders Count=" + orders.size() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) obj;
        return this.id.equals(other.id);
    }
}
