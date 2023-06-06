package dailyVideos.day25_constuctor;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Khashayar",25,'M',"Java Developer",100000, LocalDate.of(2020,12,10));

        System.out.println(employee1);

        Employee employee2 = new Employee("Hanna",35,'F',"Project Manager",150000, LocalDate.of(2010,12,10));

        System.out.println(employee2);







    }
}
