//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    A a = new A(1, 2);

    // Try to cast A to B (invalid because 'a' is not really a B)
    B b = (B) a; // This will cause a runtime error: ClassCastException
    A a1 = new B(1,2,3);
    }
}