package dailyVideos.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person{


    //Single Inheritance
     //instance variable


    private char grade;
    private String studentId;


    //Constructor
    public Student(String name, char gender, LocalDate dateOfBirth, char grade, String studentId) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
        setStudentId(studentId);
    }

    //setter getter
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    //method
    public void study(){
        System.out.println(getName()+" is studying");

    }


}
