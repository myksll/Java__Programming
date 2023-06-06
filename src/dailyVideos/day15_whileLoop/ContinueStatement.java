package dailyVideos.day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {


        for (int i = 1; i < 6 ; i++) {

             //skip 4

            if(i==4) {
                continue;
            }

            System.out.println(i);

        }

        System.out.println("-----------------------------------");

        //odd number between 10 to 20

        for (int i = 10; i < 21 ; i++) {

            if(i%2 ==0){    //  if i is even
                continue;   //  skips the current iteration         // even numbers will be skipped

            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------");

           //skip E and A

        for(char i='A'; i<='G'; i++){

            if(i=='B' || i=='E') {    // IF I WANT TO SKIP "A and E"
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------");


        for (int i = 0; i < 10; i++) {

            System.out.println("Hello World"); //10    //  if we do not use curly braces, hello world 10 times executed, hello cydeo once
            System.out.println("Hello Cydeo"); //1

        }

        System.out.println("---------------------------------------");

        // find the sum of all the even numbers between 50 to 100 (3 Solutions)

        //1.solution/////////

        int sum=0;

        for (int i = 50; i < 101; i++) {

             if(i % 2 == 0){
                 System.out.print(i+" ");
                   }
            }
        System.out.println();


        //2. solution   ----->50,52,54....100///////////

        for (int i = 50; i < 101; i += 2) {

            System.out.print(i+" ");
        }
        System.out.println();

        //3.solution/////////////

        for(int i = 50; i < 101; i++){

              if (i % 2 != 0) {   //if the i `s value is odd number is
                   continue;  // skip it
                 }
            System.out.print(i+" ");
       }

        System.out.println();//for new line

        }

    }

