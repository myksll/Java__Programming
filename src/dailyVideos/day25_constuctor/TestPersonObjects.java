package dailyVideos.day25_constuctor;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1=new Person("Merve",30,'F', LocalDate.of(1993,12,4),true,false);

        System.out.println(person1);

        person1.eat( "Hamburger");
        person1.sleeping();
        person1.drink("Ayran");












    }
}
