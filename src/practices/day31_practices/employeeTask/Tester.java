package practices.day31_practices.employeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String ID, double salary, String companyName,String jobTitle) {
        super(name, age, gender, ID, salary, companyName,jobTitle);
    }

    public void work(){
        System.out.println(getJobTitle()+ " "+getName()+ " is testing" );
    }











}
