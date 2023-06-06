package practices.day31_practices.studentTask;

public class Person {

     private String name;
     private int age;
     private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    //setter getter
    public String getName() {
        if(name == null){
            System.err.println("Name should not be set to null");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

       for(char each : name.toCharArray()){
           if(Character.isLetterOrDigit(each)){
               this.name = name;

           }
        }

      if( name.isEmpty()){
          System.err.println("Name should not be empty ");
      }

        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <=0 ){
            System.err.println("Age should not be set to negative");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        }
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender +'\''+
                '}';
    }
}
