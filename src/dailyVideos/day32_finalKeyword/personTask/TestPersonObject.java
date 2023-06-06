package dailyVideos.day32_finalKeyword.personTask;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel",'M', LocalDate.of(2000,1,21));

        System.out.println(person);
        person.breathe();

        System.out.println("-----------------------------------------");

        Employee employee=new Employee("Emily",'F', LocalDate.of(1991,2,8),"Accountant",250000);

        System.out.println(employee);

        //we can only make setter with name , salary jobTitle, because the others are final. Final can not have setter

        employee.breathe();

    }
}
