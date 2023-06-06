package practices.day31_practices.employeeTask;

public class TestEmployee {
    public static void main(String[] args) {

        Employee employee=new Employee("Hans Müller",29,'M',"12552",123004,"SIEMENS","Tester");

        System.out.println(employee);

        Developer developer=new Developer("Kandin Bilms", 42,'F',"FH44",200000,"Volvo","Developer","Java");

        System.out.println(developer);

        Teacher teacher=new Teacher("Ayse Sefa",30,'F',"F45",120000,"School","Teacher");

        System.out.println(teacher);


    }
}
