package dailyVideos.day13_customsMethods;

public class ReturnStatement {

    public static void main(String[] args) {


        eligible(52);  // no need to return value
    System.out.println("----------------------------------------------------------------");
        System.out.println(multiplication(41,25));
    System.out.println("---------------------------------------------------------------");

        System.out.println("Student Started");


        boolean exit = true;
        if(exit){
            return;      //main method gets terminated ----> under void method we can not give a value to return
        }

        System.out.println("Student Completed");  //they are not executed

        System.out.println("Test2 started");

    }

     public static void eligible (int age){

        if(age<0 || age>150){
            System.err.println("Invalid age"+age);
            return;       //exits the method  // we can not give value to return---> return 10; false that is not for void method
            // if the age is invalid, then this gets terminated.
        }

        if(age>21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol ");
        }


     }

     public static int multiplication(int n1, int n2){

        int result = n1 * n2 ;

        return result;    //you must return a value when exiting the method ---> return; is false

       //  System.out.println(result);---->unreachaBLE




     }









}
