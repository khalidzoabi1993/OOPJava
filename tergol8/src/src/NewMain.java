import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
        A a = new A(39);
        B b = new B(45, "khalid");
        A a1 = new B(66, "Ward");
        A a2 = new A(99);
//        // Array list of A and B
//        ArrayList<A> arr = new ArrayList<>();
//        arr.add(a);// add A
//        arr.add(b);// add B
//        arr.add(a1);// add// A

        a.sum(2,3);
        b.sum(2,3);
        ((B)a1).sum(2,3);
        a2.sum(2,3);
    }
}
