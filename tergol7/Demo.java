import java.util.ArrayList;

public class Demo {
    private ArrayList<Customer> customers;

    public Demo() {
        customers = new ArrayList<>();
    }

    public boolean addCustomer(Customer c) {
        if (customers.size() >= 10) return false;
        for (Customer cust : customers) {
            if (cust.equals(c)) return false;
        }
        customers.add(c);
        return true;
    }

    public boolean addOrderToCustomer(Order o, Customer c) {
        for (Customer cust : customers) {
            if (cust.equals(c)) {
                return cust.addOrderToCustomer(o);
            }
        }
        return false;
    }

    public boolean addProductToOrder(Order o, Product p) {
        return o.addProductToOrder(p);
    }

    // 🖨️ מדפיס את כל הלקוחות, ההזמנות והמוצרים
    public void printAllCustomers() {
        for (Customer c : customers) {
            System.out.println(c);
            for (Order o : c.getOrders()) {
                System.out.println("  -> " + o);
                for (Product p : o.getProducts()) {
                    System.out.println("     - " + p);
                }
            }
        }
    }

    // 🏆 מחזיר את הלקוח שהוציא הכי הרבה כסף
    public Customer getCustomerThatSpentMostMoney() {
        Customer maxCustomer = null;
        double maxSpent = 0;

        for (Customer c : customers) {
            double total = 0;
            for (Order o : c.getOrders()) {
                for (Product p : o.getProducts()) {
                    total += p.getPrice();
                }
            }

            if (total > maxSpent) {
                maxSpent = total;
                maxCustomer = c;
            }
        }

        return maxCustomer;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
