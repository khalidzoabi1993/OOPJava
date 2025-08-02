public class Person {
    private String name;
    private Gender gender; // enum as a field

    // Constructor with enum parameter
    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    // Method that uses enum
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }

    // Optional: getter
    public Gender getGender() {
        return gender;
    }
}
