package practices.day31_practices.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, String ID, double salary, String companyName, String jobTitle) {
        super(name, age, gender, ID, salary, companyName, jobTitle);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }
}
