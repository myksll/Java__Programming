package dailyVideos.day17_customClass;

public class Employee {   //class


   //there are 6 instance variables (public String name,...,...)and 3 instance Methods.(public void SetInfo, ....)

    public String name;   //we have 6 instance variable
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String EmployeeId;

    public void setInfo (String name, int age, char gender, String jobTitle, double salary, String employeeId) {
        //we are using void method because we want to only initialize name, age, gender, jobTitle, salary, EmployeeId.there is no specific Data. if we use int instead of void  then we have to use return value. but I have not a return value here.

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        EmployeeId = employeeId;
    } // sets all the attributes of the Employee object at once



    public String toString() {     // to avoid getting hash code when we print employee object
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", EmployeeId='" + EmployeeId + '\'' +
                '}';
    }


     public void work(){
         System.out.println(name+" is working.");
     }



}

