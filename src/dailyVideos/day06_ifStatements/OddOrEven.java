package dailyVideos.day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

    int number = 20;

    boolean IsEven= number %2==0;  // when we divide the number by 2, if the remainder is 0, it means that the number is even
    boolean IsOdd =! IsEven;  // number %2!=0 is also right.



        System.out.println(number+" is an even number :" +IsEven);
        System.out.println(number+ " is an odd number: " +IsOdd);















    }
}
