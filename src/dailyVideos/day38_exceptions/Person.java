package dailyVideos.day38_exceptions;

public class Person {  //throw keyboard in the custom class

    private String name;
    private int age;
    private final char gender; //no setter


    //constructor
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);

        if(! (gender == 'M'|| gender=='F') ){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age == 0){
            throw new RuntimeException ("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>150){
            throw new RuntimeException("Invalid age: "+age);//during runtime
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}