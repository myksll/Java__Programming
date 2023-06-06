package dailyVideos.day33_abstraction.employeeTask;

import dailyVideos.day32_finalKeyword.personTask.Person;

public abstract class Employee {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;


    //constructor
    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
       setName(name);
       setAge(age);
       setGender(gender);
       setId(id);
       setJobTitle(jobTitle);
       setSalary(salary);

    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    //methods

    /*normally we can use public void work(){}  method with implementation, but we want to use abstract , not body, not implementation. then we have to use abstract method with abstract class . we will add our class abstract

        public void work(){
        System.out.println(name+" is teaching/coding/testing/driving");}
     */

    public abstract void work();//abstract method (uncompleted  method)

    //toString
    @Override
    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }






}
/*
employeeTask

	Employee:
		Variables:
			name, age, gender, id, jobTitle, salary ....

		Methods:
		  abstract work();

    Teacher:
    	work(){ teaching }


	Developer:
		work() { coding }

	Tester:
		work(){ testing }

	Driver:
		work() { driving }

	...

 */