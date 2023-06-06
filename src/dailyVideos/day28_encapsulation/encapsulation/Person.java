package dailyVideos.day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {

    //private

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    //_____________________________________________________________

    //Constructor ~ Setter
    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
       setName(name);
       setAge(age);
       setGender(gender);
       setDateOfBirth(dateOfBirth);
    }


    //_____________________________________________________________

    public String getName() {
        if(name==null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.out.println("Name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    //_____________________________________________________________

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 120){
            System.err.println("Age can not be: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    //_____________________________________________________________

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender != 'M' && gender !='F'){
            System.err.println("Gender can be only 'M' or 'F'");
            System.exit(1);
        }
        this.gender = gender;
    }

    //_____________________________________________________________

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Date can not be after today's date");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    //_____________________________________________________________
    //toString

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


    //_____________________________________________________________
}

    /*
    name, age, gender, dateOfBirth

    name: can not be null/empty/blank
    Read: if name is not, return unknown instead

    age:age can not be less than 0 or greater than 120

    gender:
    write: gender can only be 'M or 'F

    dateOfBirth
    Write: can not b after today's date

    Add a constructor that can set all the fields

    Add toString()
      */