import java.util.ArrayList;

public class A {

    private int age;
    private String name;
    ArrayList<B> arr;
    public A(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new ArrayList<>();
    }

    public void foo(){
        System.out.println("A: foo");
        // print all the address of the B in the array list
        for (B b : arr) {

            System.out.println(b.getAddress());
        }



    }
}

