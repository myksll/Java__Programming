package dailyVideos.day17_customClass;

public class Dog {

      //instance variables

      public String name; // instance variable
      public String breed;
      public String size;
      public char gender;
      public int age;
      public String color;


      public void setInfo(String name, String breed,char gender, int age,String size,  String color){
      this.name = name;     // this keyword is used for calling the instance variable name.
      this.breed = breed;
      this.size = size;
      this.gender = gender;
      this.age = age;
      this.color= color;
      }

      //instance method

      public void eat(){
          System.out.println(name + " is eating dog food.");
      }

      public void drink(){
          System.out.println(name + " is drinking water.");
      }

      public String toString() { // to avoid getting hash-codes when we print the class object
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", size='" + size + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    ", color='" + color + '\'' +
                    '}';
      }
      }
