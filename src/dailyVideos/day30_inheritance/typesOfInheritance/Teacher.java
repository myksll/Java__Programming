package dailyVideos.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee{

    //constructor
    public Teacher(String name, char gender, LocalDate dateOfBirth, String employeeId, String jobTitle, double salary) {
        super(name, gender, dateOfBirth, employeeId, jobTitle, salary);
    }

    //method
    public void teach() {
        System.out.println(getName() + " is teaching");
    }

}


