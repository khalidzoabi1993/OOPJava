public class B extends A{
    private String name;
    public B(int number, String name) {
        super(number);
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    @Override
    public void sum(int x, int y){
        System.out.println("The mul is : " + (x*y));
    }
}
