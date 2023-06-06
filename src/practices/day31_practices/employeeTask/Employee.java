package practices.day31_practices.employeeTask;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private String ID, companyName;
    private double salary;
    private String jobTitle;

    public Employee() {

    }

    //constructor
    public Employee(String name, int age, char gender, String ID,double salary, String companyName,String jobTitle) {
       setName(name);
       setAge(age);
       setGender(gender);
       setID(ID);
       setSalary(salary);
       setCompanyName(companyName);
       setJobTitle(jobTitle);
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


}
    public int getAge() {
        if(age <= 0 ){
            System.err.println("Age can not be zero or negative");
        }

        return age;
    }

    public void setAge(int age) {

        if(age>18){
            this.age = age;
        }

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'M' || gender== 'F'){
            this.gender = gender;
        }

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name+" is working");
    }


    @Override
    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID='" + ID + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
