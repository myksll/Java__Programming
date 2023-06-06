package dailyVideos.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {

    //3 instance are final
    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    //constructor
    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);

        if(!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender: "+ gender);
            System.exit(1);
        }
        this.gender = gender;

        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear()- dateOfBirth.getYear();

    }

    //static
    public static final int numberOfHead; // 1 static is final

    static{
        numberOfHead=1;
    }

    //if the data is constant (final), we can read it. We generate 4 getters(name, gender, age, dateOfBirth) although 3 of them are final variables.But setters; I can not generate setter all of them, because setter is useful changing the value. 3 value are unchangeable.so we can not use setters for 3 value. Final refuse the change(the setters)


    //getters
    public String getName() {
        return name;
    }

    public void setName(String name) { //setter wants to change the value, so we can use and change only "name" variable. Setter is instance method. it can be used after creating object
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    //methods
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public final void breathe(){  //To make sure that this implementation will not change for any subclass
        System.out.println(name+" is breathing");
    }
//i can not override final method in subclass

    //toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

/*
variables:
      instance: name, gender, age, dateOfBirth
      static:   numberOfHead

Methods:
      eat(food) , drink(drink), sleep()
      breathe()

 */