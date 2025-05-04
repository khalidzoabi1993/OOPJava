//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 30, "Developer");
        Employee employee2 = new Employee("Bob", 25, "Designer");
        Manager manager1 = new Manager("Charlie", 40, 5);
        Manager manager2 = new Manager("Diana", 35, 10);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(manager1);
        System.out.println(manager2);


    }
}