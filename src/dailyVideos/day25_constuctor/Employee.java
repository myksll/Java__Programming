package dailyVideos.day25_constuctor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hiredDate;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }//allows us to set all the instances variables of the object as soon as the object is created

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern(" MMMM/dd/y ")) +
                '}';
    }
}//allows us to print the object when it is passed in the print statement

/*
name
age
gender
jobTitle
salary
hireDate
 */