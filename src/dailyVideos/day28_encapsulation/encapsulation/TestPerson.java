package dailyVideos.day28_encapsulation.encapsulation;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Merve",30,'F', LocalDate.of(2023,04,15));

        System.out.println(person1);


    }


}
