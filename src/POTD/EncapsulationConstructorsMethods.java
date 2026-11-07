package POTD;
import java.util.Random;

class Student {
    private static Random rand = new Random();
    private int studentID;
    private String studentName;
    private double gpa;

    public Student() {
        this(rand.nextInt(10000) + 1000, "Unknown", 0.0);
    }

    public Student(int studentID, String studentName) {
        this(studentID, studentName, 0.0);
    }

    public Student(int studentID, String studentName, double gpa) {
        this.studentID = studentID;
        this.setStudentName(studentName);
        this.setGpa(gpa);
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentName(String name) {
        if (!name.isBlank()) {
            studentName = name;
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student Profile");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentID);
        System.out.println("GPA: " + gpa);
    }
}

class EncapsulationConstructorsMethods {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(101, "Alice Smith");
        Student student3 = new Student(102, "Bob Jones", 3.8);
        Student student4 = new Student(103, "Charlie Brown", 2.5);

        Student[] classroom = {student1, student2, student3, student4};

        for (Student student : classroom) {
            student.displayStudentInfo();
        }


    }
}
