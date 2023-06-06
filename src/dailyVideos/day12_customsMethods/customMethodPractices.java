package dailyVideos.day12_customsMethods;

public class customMethodPractices {
    public static void main(String[] args) {


     maxNum(25.5,45.8);  //45.8

     maxNum(100000,5412358); //5412358

     maxNum(-25,-895); //-25

     initial("Merve", "karaca"); //M:K



    }

    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1 num2)
    public static void maxNum (double num1, double num2){

        if(num1>num2){
            System.out.println(num1+" is the maximum number");
        }else if(num2>num1){
            System.out.println(num2+ " is the maximum number");
        }else{
            System.out.println("Equal");
        }


        }
    // create a method that can display the initials of a person


        public static void initial(String firstName, String lastName){


        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
               initial = initial.toUpperCase();

        System.out.println("initial is: "+initial);

            //System.out.println(firstName.toUpperCase()+" "+lastName.toUpperCase());


    }













}
