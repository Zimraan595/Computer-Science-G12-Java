package Classes;

public class CreatingClasses {

}

class Monkey {
    private static int numberOfMonkeys = 0;
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
        numberOfMonkeys++;
    }

    public String fullName() {
        return (firstName + lastName);
    }

    public boolean isBaby() {
        return age < 4;
    }

    public boolean canBeLeader() {
        return  age >= 10;
    }
}