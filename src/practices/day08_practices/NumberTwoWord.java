package practices.day08_practices;

public class NumberTwoWord {

    public static void main(String[] args) {


  int num=12;

 String result= "invalid";


 if(num>=1 && num<=9) {

     result = (num == 1) ? "one" : (num == 2) ? "two" : (num == 3) ? "three" : (num == 4) ? "four" : (num == 5) ? "five" : (num == 06) ? "six"
             : (num == 7) ? "seven" : (num == 8) ? "eight" :  "nine";
 }
        System.out.println(result);
    }
}
