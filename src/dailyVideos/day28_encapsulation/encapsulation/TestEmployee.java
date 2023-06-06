package dailyVideos.day28_encapsulation.encapsulation;

import javax.swing.plaf.basic.BasicTreeUI;

public class TestEmployee {


    public static void main(String[] args) {

        Employee employee1 = new Employee("Khashayar",30,"Java Developer", -100000);
        //employee1.salary = -200000; //That gives error(negative number)

        System.out.println(employee1);//Salary can not be negative: -100000.0


        System.out.println("---------------------------------------------------------");

        employee1.setSalary(200000);
        System.out.println(employee1.getSalary());

        System.out.println("---------------------------------------------------------");

        employee1.setName("Feriha feriha");
        System.out.println(employee1.getName());

        System.out.println("---------------------------------------------------------");

        employee1.setAge(-24);
        System.out.println(employee1.getAge());

    }

}
