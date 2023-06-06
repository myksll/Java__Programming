package dailyVideos.day13_customsMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {
        // 1.way  //odd
        System.out.println( isOdd(100));
///////////////////////////////////////////////////////////////////
        //2.way //even
        int num=100;
        if(isEven(num)){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
//////////////////////////////////////////////////////////////////////

        System.out.println(max(14,25));



    }


     public static boolean isOdd (int num){

         //1.solution  return (num%2 != 0) ?  true : false;

         //2.solution

         if(num%2 != 0){
             return true;
         }
             return false;
     }

     public static boolean isEven (int num){

          // 1. solution return !isOdd(num);

          // 2. solution

          return (num%2 == 0) ? true: false;
     }

     public static int max(int n1,int n2 ){

      //1.solution   return n1>n2 ? n1 : n2;  //ternary

        //2. solution

         if(n1>n2) {
             return n1;
         }
             return n2;   //else block is not needed now.
     }


}

// create a method named isOdd, that can return true if a number is odd number.

// create a method named isEven , that can return true if a number is an even number

// create a method named max, that can return the maximum number between two numbers

// create a method named min, that can return the minimum number between two numbers