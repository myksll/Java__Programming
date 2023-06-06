package dailyVideos.day24_dateAndTime;

import dailyVideos.day17_customClass.Employee;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesArrayList {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList( new Employee(), new Employee(), new Employee(), new Employee(), new Employee() ) );

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        //  1.1 Write a program that can display the name and job title of each employee

        for( Employee each: employees){
        //in for each loop, we need to use Employee object. We can not use "String or int" instead of Employee. because I have only Employee object in the array list

       //System.out.println(each);//Employee{name='Josh',age=34,gender=M, jobTitle='Java Developer', salary=100000.0, EmployeeId='A01'}..... -->all the other will be printed

         System.out.println(each.name+ " : "+each.jobTitle);//Josh : Java Developer .... -->the other will be also printed
        }


        System.out.println("--------------------------------------------------------------------------------------------------");

        //   1.2 Write a program that can display the names of "Java Developers"

        for (Employee each : employees) {

            if(each.jobTitle.equals("Java Developer")){ //if the job title is Java developer
                System.out.println(each.name); //Josh  Bella--->prints the name of the employee
            }
        }

        System.out.println("--------------------------------------------------------------------------------------------------");

        // 1.3 Write a program that can display the maximum and minimum salary

        double max=  employees.get(0).salary;
        double min = employees.get(0).salary;

        for (Employee each : employees) {

            if(each.salary > max){
                max = each.salary;
            }

            if(each.salary < min){
                min = each.salary;
            }
        }

        System.out.println("max = " + max); //max = 105000.0
        System.out.println("min = " + min);// min = 100000.0

        System.out.println("--------------------------------------------------------------------------------------------------");

        //  1.4 Create two arraylists named femaleEmployees and maleEmployees,
        //  write a program that can add all the female employees and male employees to the femaleEmployees and maleEmployees arraylists

        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee>  maleEmployees = new ArrayList<>();

        for (Employee employee : employees) {

            if(employee.gender =='M' ){ //if the employee is male
              maleEmployees.add(employee);
            }else{
                femaleEmployees.add(employee);
            }
        }

        System.out.println(femaleEmployees);
        System.out.println("Total number of female employees: "+femaleEmployees.size());//Total number of female employees: 2

        System.out.println(maleEmployees);
        System.out.println("Total number of male employees: "+maleEmployees.size());//Total number of male employees: 3

    }
}
/*
1. Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a program that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male employees to the femaleEmployees and maleEmployees arraylists

 */