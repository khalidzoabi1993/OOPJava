import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        B b = new B("Afula");
        B b1 = new B("Haifa");
        B b2 = new B("Tel Aviv");

        ArrayList<B> arr = new ArrayList<>();
        arr.add(b);
        arr.add(b1);
        arr.add(b2);
        A a = new A(39, "Khalid");
        a.arr = arr;
        a.foo();


        }
    }
