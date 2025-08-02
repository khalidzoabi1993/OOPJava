public class B{

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;
    public B(String address) {
        this.address = address;
    }



    public void kuku(){
        System.out.println("B: kuku");
    }
}
