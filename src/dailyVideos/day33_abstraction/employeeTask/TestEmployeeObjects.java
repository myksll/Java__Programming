package dailyVideos.day33_abstraction.employeeTask;

import practices.day28_practices.TestRectangle;

public class TestEmployeeObjects {

    public static void main(String[] args) {

      //  Employee employee = new Employee("Daniel", 54,'M',"A12","Sdet",85000);
        //We can not create objects from an abstract class. Object must be created from a concrete from  concrete class(not abstract)(developer, tester, teacher , driver are created in concrete class)

        Teacher teacher=new Teacher("James", 45, 'M',"B1","Math Teacher",75000);

        Developer developer = new Developer("Lucy",30,'F', "C1", "Java Developer",95000,"Java");

        Driver driver = new Driver("Aaron", 48, 'M',"D1","Truck Driver",90000);

        Tester tester = new Tester("Emily",32,'F',"E1", "Manual tESTING",80000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("------------------------------------------------------------------------------");

        teacher.work();
        developer.work();
        tester.work();
        driver.work();

        System.out.println("--------------------------------------------------------------------------------");






    }
}
