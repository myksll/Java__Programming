package dailyVideos.day12_customsMethods;

public class customMethodsWithParameter {

    public static void main(String[] args) {

          int num1=25;
          oddOrEven(num1);


         int num2=52;
          oddOrEven(num2);

    }
    //parameter
  //the method takes an argument number, and verifies if the number is odd or even number.

     public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }


     }


















}
