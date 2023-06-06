package dailyVideos.day13_customsMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

          int total =   addition(10,20);


         square(10);  //two choice for the data is to be executed 1. int total=square(10); 2. square(10); System.out.println(square);
         System.out.println(square(10));



         System.out.println(cube(15));  // or     int r= cube(10);


    }



    public static int addition( int n1, int n2){

        int result= n1+n2;
        return result;
    }


    public static  int square(int num){

        int square= num * num;

        return square;

    }


    public static int cube(int num){

          int cube= square(num) * num;

          return cube;

    }












}
 /*
    void return type
    sum(20,40);

    public static  void sum(int n1,int n2){

    int result= n1+n2;
    System.out.println(result);
*/
