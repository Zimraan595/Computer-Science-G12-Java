package Classes;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public int getNumberOfMonkeys() {
        return numberOfMonkeys;
    }

}

public class CreatingClasses {
    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        m1.setGender("male");
        m1.setAge(11);

        Monkey m2 = new Monkey();
        m2.setGender("female");
        m2.setAge(2);

        m1.setFirstName("Alan");
        m1.setLastName("Turning");

        System.out.println(m1.fullName());
        System.out.println(m2.fullName());

        

    }
}
