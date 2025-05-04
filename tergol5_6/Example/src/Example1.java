class Parent {
    public void speak() {
        System.out.println("Parent speaks");
    }

    public void run() {
        System.out.println("Parent runs");
        speak();
    }
}

class Child extends Parent {
    @Override
    public void speak() {
        System.out.println("Child speaks");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.run();
        // Output:
        // Parent runs
        // Child speaks

        // Explanation:
        // The method speak() in Child class overrides the method in Parent class.
        // The method run() in Parent class calls the method speak() in Child class.

        // what happens if we create a new instance of Parent and call run()?
        Parent p = new Parent();
        p.run();
        // Output:
        // Parent runs
        // Parent speaks
        // Explanation:
        // The method speak() in Parent class is called, as it is not overridden in Child class.
        // The method run() in Parent class calls the method speak() in Parent class.

    }
}
