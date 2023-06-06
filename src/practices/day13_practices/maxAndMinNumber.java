package practices.day13_practices;

public class maxAndMinNumber {
    public static void main(String[] args) {


        System.out.println(max(2,89));

////////////////////////////////////////////

        System.out.println(min(2,89));
    }

    public static int max (int num1, int num2){

        if(num1>num2){
            return num1;
        }
            return  num2;
    }


     public static int min (int num1,int num2){

         return( num1<num2) ? num1 : num2;


    }










}
