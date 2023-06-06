package dailyVideos.day24_dateAndTime;

import java.time.LocalDate;

public class Person {


    public String name;
    public int age;   //we will automatically calculate the age---> todayDate - dateOfBirthday = age
    public char gender;
    public LocalDate dateOfBirthday ;

    public void setInfo (String name, char gender, LocalDate dateOfBirthday) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirthday = dateOfBirthday;
        this.age = LocalDate.now().getYear() - dateOfBirthday.getYear(); //we use getYear()
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }
}
