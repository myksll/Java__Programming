package dailyVideos.day06_ifStatements;

public class OperatorPrecedence {


    public static void main(String[] args) {
        System.out.println(5+2*3);   //11   * has more precedence than +

        System.out.println(7+3-2/2);  //9  division has higher order than + and -

        System.out.println(-5+2); //-3

        System.out.println(10>9==8<7 && "Java" == "Pyhton" || 'a'=='A');
                    //         false         false.............false         false

       int a=20;

       a+= 10+ 2 * 3;

       // a += 16
        // a= 16+20 =36

        System.out.println(a);





    }
}
