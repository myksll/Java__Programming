package dailyVideos.day14_forLoop;

public class MethodOverLoadingPractices {


    public static void main(String[] args) {

        System.out.println( sum(10,20) ) ;
        System.out.println( sum(10,20,30) );
        System.out.println( sum(5.8, 2.8));
        System.out.println( sum(65.8,3,5.7,9.5 ));
    }


    //6 different methods with the same name  (3 int , 3 double)


    public static int sum (int num1, int num2)   {  return num1 + num2; }

    public static int sum (int num1, int num2, int num3)  {  return sum(num1,num2)+ num3; }

    public static int sum (int num1, int num2, int num3,int num4) {  return sum(num1,num2,num3)+ num4; }

    public static double sum(double num1, double num2 )  {  return num1+num2; }

    public static double sum(double num1, double num2, double num3 ) {   //1.  return num1+num2+num3; //2.
        return sum(num1,num2) +num3; }

    public static double sum( double num1, double num2, double num3, double num4){  return sum(num1,num2,num3)+num4; }


}
