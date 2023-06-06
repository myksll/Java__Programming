package dailyVideos.day28_encapsulation.encapsulation;

public class Employee {



    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    //Constructor and setters
    public Employee(  String name,int age,String jobTitle, double salary) {
       setName(name);
       setJobTitle(jobTitle);
       setAge(age);
       setSalary(salary);
    }

    //private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }


//---------------------------------------------------------------------------

    //private String jobTitle;
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Job title of the employee can not be empty or blank");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }


    //---------------------------------------------------------------------------

    //private String name
    public String getName() {
        if(name == null){
            System.err.println("Name has not been set"); //or return "UNKNOWN"
             System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    //---------------------------------------------------------------------------


    //public double salary; -->we can not control negative number
    //private double


    public double getSalary() {  //READ

        if(salary == 0.0){
            System.err.println("Salary has not been set");
            System.exit(1);
        }

        return salary;
    }

    public void setSalary(double salary) {  //WRITE

        if(salary < 0 ){
            System.err.println("Salary can not be negative: "+salary);
            System.exit(1);
        }

        this.salary = salary;
    }


    //----------------------------------------------------------------------------
//toString message

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" +getAge() +
                ", jobTitle='" + getJobTitle()+ '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}








