package POTD;

class Student {
    private int studentID;
    private String studentName;
    private double gpa;

    public Student() {
        this(0, "Unknown", 0.0);
    }

    public Student(int studentID, String studentName) {
        this(studentID, studentName, 0.0);
    }

    public Student(int studentID, String studentName, double gpa) {
        this.studentID = studentID;
        this.studentName = studentName;
        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        }
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
}

class EncapsulationConstructorsMethods {
    public static void main(String[] args) {

    }
}
