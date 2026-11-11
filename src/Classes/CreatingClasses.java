package Classes;

public class CreatingClasses {

}

class Monkey {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Monkey() {
        this("[first name]");
    }

    public Monkey(String firstName) {
        this(firstName, "[last name]");
    }

    public Monkey(String firstName, String lastName) {
        this(firstName, lastName, "unknown");
    }

    public Monkey(String firstName, String lastName, String gender) {
        this(firstName, lastName, gender, 1);
    }

    public Monkey(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String fullName() {
        return 
    }
}