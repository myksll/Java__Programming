package IQ.Task_1;

public class oddOrEven_1 {

    public static void main(String[] args) {

        int number =20;

        boolean isEven= number%2 ==0 ; //100 -->100%2 ==0  // when we divide the number by 2, if the remainder is 0, it means that the number is even
        boolean isOdd = !isEven ; //// number %2!=0 is also right.

        System.out.println("isOdd = " + isOdd);
        System.out.println("isEven = " + isEven);

    }
}
//1️⃣  Numbers -- odd & even
//Write a method that can identify  a given number is even or odd.
//EX:
//       identify(5) --> "Odd"
//       identify(6) --> "Even"


