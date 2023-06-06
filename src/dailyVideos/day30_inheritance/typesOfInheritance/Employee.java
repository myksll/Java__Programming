package dailyVideos.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person{


    private String employeeId, jobTitle;
    private double salary;

    //constructor
    public Employee(String name, char gender, LocalDate dateOfBirth, String employeeId, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    //setter getter
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

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


    //method
    public void work(){
        System.out.println(getName()+" is working");
    }

}
