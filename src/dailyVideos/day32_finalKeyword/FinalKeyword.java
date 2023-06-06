package dailyVideos.day32_finalKeyword;

import dailyVideos.day27_accessModifiers.Car;

import java.time.LocalDate;


class CydeoStudent{ //parent class

    public final void language(){ //FINAL METHOD can NEVER  be overridden
        System.out.println("Java Programming");
    }

       /*
      public void language(){ //void method can be overridden
          System.out.println("Java Programming");
      }
     */

   }

public class FinalKeyword extends  CydeoStudent{  //subclass -->that class(final class) can never have a child class. but final class can be child class like FinalKeyboard.

     /*
    public void language(){
        System.out.println("Python Programming");
    }
     */

    public FinalKeyword(){ //it is not applicable

    }



    // public final  void main(String[] args)
    public void main(String[] args) { //if the main method is returned to final method, it is no point final method vor static method, because you can never override static method

    //local variable
        char gender='M';  //local variable: I declared within main method
        System.out.println(gender); //M

        gender='F';
        System.out.println(gender);//F-> we can reassign it.we can change the variable.A new value is stored into the variable.Old value is gone

        System.out.println("---------------------------------------------------------------------------------");


    //Final variable
        final char gender2='M';  //final variable is assigned with M.It can only be assigned one time
        System.out.println(gender); //M

       /*
        gender2 = 'F';
        System.out.println(gender);
        */

        System.out.println("---------------------------------------------------------------------------------");

        LocalDate dateOfBirth = LocalDate.now(); //if the person is born today
        //this Data is changeable , not constant.
        System.out.println(dateOfBirth);//2023-04-25

        dateOfBirth =dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);//2024-04-25



        System.out.println("---------------------------------------------------------------------------------");

    //if you want to prevent such an action of changing the value of the variable , you need to declare the  variable as Final

        final LocalDate dateOfBirth1 = LocalDate.now(); //unchangeable Date
        System.out.println(dateOfBirth1);//2023-04-25

        System.out.println("---------------------------------------------------------------------------------");
    //instance method can be overridden.
        new CydeoStudent().language(); //Java Programming
        new FinalKeyword().language();//Python Programming

        System.out.println("---------------------------------------------------------------------------------");

        final String  name = "James";
        //James(original value) will be eligible to Garbage collection in local variable, but in Final variable, it is not eligible to Garbage collection, because we can not create a new value

        /*
        name= "Daniel";
        System.out.println(name);
         */






















    }
}
