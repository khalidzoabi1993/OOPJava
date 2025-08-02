public class A {
    private int number;
    public A(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void sum(int x, int y){
        System.out.println("The sum is : " + (x+y));
    }
}
