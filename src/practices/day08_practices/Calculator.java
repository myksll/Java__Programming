package practices.day08_practices;

public class Calculator {
    public static void main(String[] args) {

        char mathOperator='-';

        double num1=5,
               num2=8;

        switch(mathOperator){

            case '+':
                System.out.println(num1+num2);
                break;
            case '-' :
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("invalid operator");
        }


















    }
}
