package dailyVideos.day14_forLoop;

public class forLoopPractice {
    public static void main(String[] args) {

   /*  for(int i = 5; i <= 10; ){   //(i-- )  ---> pointless     i-- ----> increment

         System.out.println("Hello Cydeo");  // infinite number will be executed
     }

        System.out.println("Hello World"); // it will be never executed. because it can only be executed after the Executing of Hello   Cydeo  finishes.
*/

        for(int i = 10; i >= 5; i--) {               // i : 10 ,9 ,8 ,7 ,6 ,5.
            System.out.println("Hello Cydeo "+i);       //   :  1, 2, 3, 4, 5, 6.    // 6 times Hello Cydeo
        }

        System.out.println("--------------------------------------------------------------");

    //1.task sum of all the numbers between 1-100

         int sum = 0;

         for(int i = 1; i <= 100; i++ ){
             sum+= i;         //5050 ----> all numbers are summed until iteration is false
          }

         System.out.println(sum);

        System.out.println("------------------------------------------------------------------");

      //2.task  print all the alphabet letters A-Z

          for (char i = 'A'; i<='Z'; i++){
              System.out.print (i +" ");       // *use for the same line --> (print)  *use for spaces---> (" ")
          }

        System.out.println(); // that is for the starting of "Hello" on the other line

        System.out.println("Hello"); // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
                                     // Hello

        System.out.println("----------------------------------------------------------------------");

      // 3.task  print all the alphabet letters in backwards

         for (char i = 'Z'; i >= 'A'; i--){
              System.out.print(i+" ");  //Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
         }

    }
}




