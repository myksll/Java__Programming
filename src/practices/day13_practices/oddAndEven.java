package practices.day13_practices;

public class oddAndEven {
    public static void main(String[] args) {

        System.out.println( isOdd(78));

     /////////////////////////////////////

        System.out.println(isEven(5));

    }

    public static boolean isOdd(int num){

         if (num % 2 != 0){
           return true;

        }
           return false;

    }


    public static boolean isEven(int num){


       // return !isOdd(num) ;

        return (num %2 == 0) ? true : false;


    }




}
