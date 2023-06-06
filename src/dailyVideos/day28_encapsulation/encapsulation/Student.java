package dailyVideos.day28_encapsulation.encapsulation;

public class Student {

//Private String name;
    private String name;


    public String getName() {
        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }


    public void setName(String name) {
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }

        if(hasDigit){
            System.err.println("Invalid name: " +name);
            System.exit(1);
        }
        this.name = name; //if argument is valid


        }


    //private  int age;
     private int age;

     //getters method: only for reading
     public int getAge(){  //getters means: get Age()
          if(age==0){
               System.err.println("Age has not been set");
               System.exit(1);
          }
          return age;
     }

     //setters method: only for writing (return a value)
     public void setAge(int age){

          if(age < 1 || age>100){ //if age is invalid
               System.err.println("Invalid age:" +age); //err: program gets terminated. firstly, err print wil be executed
               //return; //existing the method -->output-->Invalid age: -25  0 (I should delete 0)--< that is not enough. I should not be able to execute the remaining code fragments, therefore , use System.exit(1)
               System.exit(1);  //output:Invalid age:-25 --> but next code fragments will be not executed. program gets terminated
          }

          this.age=age;
     }

}
