class Parent {
    public void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    public void greet(String name) {
        System.out.println("Hello " + name + " from Child");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();          // ?
        c.greet("Alice");   // ?
        // Output:
        // Hello from Parent
        // Hello Alice from Child
        // Explanation:
        // The method greet() in Parent class is called, as it is not overridden in Child class.
        // The method greet(String name) in Child class is called, as it is not overridden in Parent class.
        // The method greet() in Parent class is not overridden in Child class, so it is called directly.

    }
}
