public class Vehicle {
    private int year;
    private String brand;

    public Vehicle(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("Vehicle Info: " + year + " " + brand);
    }
}
