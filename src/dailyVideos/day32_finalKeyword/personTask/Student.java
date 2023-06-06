package dailyVideos.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
    }


    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "grade=" + grade +
                '}';
    }
}
