package dailyVideos.day24_dateAndTime;

import dailyVideos.day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;



public class removeElementsFromCollection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        //!!!!!  do not use remove() method in the loop
        // we will use iterable --->list.removeIf()--->returns boolean --Yit is not a new functionality


       // at the removeIf methods it is usually used "p" as a variable name
       // p-> --- that means this variable is going to take every single element in Arraylist during the iteration
       //list.removeIf(p-> , condition p<4)


        list.removeIf( p-> p<4 );
        System.out.println(list); //[4, 5, 6, 7, 4, 5, 6, 7] -> including in 4 also.


        list.removeIf( p-> p>4 );
        System.out.println(list); //[1, 2, 3, 4, 1, 2, 3, 4]

        list.removeIf( p-> p>8 );
        System.out.println(list); //[]

        System.out.println("---------------------------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python","Java", "C#", "Ruby"," Python","Java Script","C++", "C"));  // we can use removeIf() method

        names.removeIf(p-> p.equals("Java"));
        System.out.println(names);//[Python, C#, Ruby,  Python, Java Script, C++, C]

        names.removeIf(p-> p.startsWith("J") );
        System.out.println(names); //[Python, C#, Ruby, Python,"C++", "C"]

        System.out.println("---------------------------------------------------------------------------------------");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList( new Employee(), new Employee(), new Employee(), new Employee(), new Employee() ) );

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        //I want to remove some employees that are making more than 100000.

        employees.removeIf(p ->  p.salary > 100000 ); //p salary--> means employee salary
        //System.out.println(employees);

        for (Employee each: employees) {
            System.out.println(each.name+ " : "+each.salary);//Josh : 100000.0  Emily : 90000.0    Bella : 95000.0
        }


        employees.removeIf(p-> p.age>35);

        for (Employee each : employees) {
            System.out.println(each.name+ ": "+each.age);  //Josh: 34 Bella: 29
        }

    }
   }


/*
    2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]

 */