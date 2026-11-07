package POTD;

import java.awt.*;

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
        
    }
}
