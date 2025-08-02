import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();

        // יצירת מוצרים
        Product p1 = new Product("Laptop", 3500.0);
        Product p2 = new Product("Mouse", 150.0);
        Product p3 = new Product("Keyboard", 300.0);
        Product p4 = new Product("Monitor", 1200.0);

        // יצירת לקוחות
        Customer c1 = new Customer("123", "Khaled", "Zoabi", "Nazareth");
        Customer c2 = new Customer("456", "Raneh", "Zoabi", "Haifa");

        // הוספת לקוחות
        demo.addCustomer(c1);
        demo.addCustomer(c2);

        // יצירת הזמנות
        Order o1 = new Order(1, c1, LocalDate.now(), "שולם");
        Order o2 = new Order(2, c2, LocalDate.now(), "לא שולם");

        // הוספת מוצרים להזמנות
        demo.addProductToOrder(o1, p1);
        demo.addProductToOrder(o1, p2);
        demo.addProductToOrder(o1, p3);

        demo.addProductToOrder(o2, p2);
        demo.addProductToOrder(o2, p4);

        // הוספת ההזמנות ללקוחות
        demo.addOrderToCustomer(o1, c1);
        demo.addOrderToCustomer(o2, c2);

        // ✅ הדפסה
        System.out.println("----- All Customers -----");
        demo.printAllCustomers();

        // ✅ מציאת הלקוח שהוציא הכי הרבה כסף
        Customer top = demo.getCustomerThatSpentMostMoney();
        if (top != null) {
            System.out.println("\nCustomer that spent the most money:");
            System.out.println(top);
        } else {
            System.out.println("No customers or orders.");
        }
    }
}
