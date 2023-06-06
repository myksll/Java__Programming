package dailyVideos.day13_customsMethods;

public class calculate {
    public static void main(String[] args) {


          calculate(10,20,'*');

  /*  Scanner input= new Scanner(System.in);  //wenn wewanna use scanner , can use this code.

        System.out.println("Enter your two numbers and a math operator:" );
        double n1= input.nextDouble(),
                n2=input.nextDouble();
        char operator=input.next().charAt(0);

        calculate(n1,n2,operator);
*/



    }

    public static void calculate( double num1, double num2, char mathOperator ){


        double result= 0;
             switch(mathOperator) {

                 case '+':
                     result = num1 + num2;
                     System.out.println(num1 + "" + mathOperator + "" + num2 + "=" + result);

                     //  System.out.println(num1+""+mathOperator+""+num2+"="+ (num1+num2));  it is also true without double result
                     break;

                 case '-':
                     result = num1 - num2;
                     System.out.println(num1 + "" + mathOperator + "" + num2 + "=" + result);
                     break;
                 case '*':
                     result = num1 * num2;
                     System.out.println(num1 + "" + mathOperator + "" + num2 + "=" + result);
                     break;
                 case '/':
                     result = num1 / num2;
                     System.out.println(num1 + "" + mathOperator + "" + num2 + "=" + result);
                     break;
                 default:
                     System.out.println("Invalid Operator"+mathOperator);
             }
    }



/*
	1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)
 */














}
