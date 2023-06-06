package practices.day06_practices;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 10;
        double n2 = 20;

        char mathOperator = '+';

        double result = 0;

        if (mathOperator == '+') {
            result = n1 + n2;

            if (mathOperator == '-') {
                result = n1 - n2;
            }
            if (mathOperator == '*') {
                result = n1 * n2;
            }

            if (mathOperator == '/') {
                result = n1 / n2;
            }

            System.out.println(result);


        }
    }
}