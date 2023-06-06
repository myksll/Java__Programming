package dailyVideos.day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if(i==6){ // if it i`s value reaches 6
                break;  //exits the loop
            }

            System.out.println(i);

        }

        System.out.println("-------------------------------");

        for(char i= 'A'; i<='Z';i++){

            System.out.println(i); // println is before the if statements----> j will be executed. otherwise j will be not executed

            if(i=='J'){

                System.out.println("Loop is terminated");
                break;

                //System.out.println("Loop is terminated"); -----> it is going to give me error
            }

        }
        System.out.println("---------------------------------");

        for (;;) {
            System.out.println("Hello");
            break;
        }






    }
}
