package dailyVideos.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;
    private double salary;

    //constructor
    public Employee(String name, char gender,  LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    //setter getter
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //methods
    public  void work(){
        System.out.println(getName()+" is working"); //I can change it
    }

    /*
    breathe final method from parent class
    public final void breathe(){ //this implementation can never change
    }
     */

    //toString
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth()+
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }




}
