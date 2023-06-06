package practices.day14_practices;

public class SumOfDigits_ {
    public static void main(String[] args) {


        String sumOfDigits="A1B2C3"; //  1+2+3=6
        int sum=0;

        for (int i = 0; i < sumOfDigits.length() ; i++) {

             char ch= sumOfDigits.charAt(i);

             if(ch>='0' && ch<='9'){
                 sum += ch-48; // 	To convert char to number:     '0' - 48   ==> 0    '1' - 48   ==> 1



            }
             System.out.println(sum);
        }









    }
}
