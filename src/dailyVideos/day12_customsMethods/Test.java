package dailyVideos.day12_customsMethods;

public class Test {
    public static void main(String[] args) {

// call the methods from class

        int number=300;

        customMethodsWithParameter.oddOrEven(300);

/*
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
*/

        System.out.println("------------------------------------------------------------------------");

        String firstName="Vasly",
                lastName="Dobriansjlk";

         customMethodPractices.initial(firstName,lastName);

/*

        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
               initial = initial.toUpperCase();

        System.out.println("initial is: "+initial);
 */










    }
}
