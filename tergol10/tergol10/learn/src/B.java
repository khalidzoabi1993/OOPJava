public class B extends  A {
    private int z;

    public B(int x, int y, int z) {
        super(x, y);
        this.z = z;

    }

    public int getZ() {
        return this.z;
    }

    public void foo() {
        System.out.println("B: foo");
    }

    @Override
    public void printCoordinates() {
        super.printCoordinates();
        System.out.println(", Z: " + this.z);
    }

}
