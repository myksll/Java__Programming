package dailyVideos.day05_operators;

public class shorthandOperators {

    public static void main(String[] args) {

        int a=20;
        System.out.println(a);    //20
        System.out.println(a);    //20

        a = 40;
        System.out.println(a);  //40

        a=90;
        System.out.println(a);   //90

        System.out.println("--------------------------------------------"); //addition

        double balance= 100;

        balance += 1000;   //balance= 100+1000=1100

        System.out.println(balance);

        balance +=500;  // balance= 1100+500=1600

        System.out.println("balance = " + balance);

        balance +=10000;

        System.out.println("balance = " + balance);

        System.out.println("------------------------------------------------------------"); //subtraction

        balance -= 1000;   // balance = 11600-1000= 11500

        System.out.println("balance = " + balance);


         balance-=5000;
        System.out.println("balance = " + balance);

        System.out.println("----------------------------------------------------------------"); //multiplication

        double salary =45000;

        salary *=2;   //salary=45000*2= 90000

         salary *= 3;  //90000*3=270000

        System.out.println(salary);

        System.out.println("---------------------------------------------------------------"); //division


        double eth= 4;
         
        eth *=250;
        System.out.println("eth = " + eth); //1000
        
        eth/=2;

        System.out.println("eth = " + eth); //500

        System.out.println("---------------------------------------------------------------------");


        System.out.println("salary = " + salary);

        salary/=2;

        System.out.println("salary = " + salary); //135000

        System.out.println("-------------------------------------------------------------------"); //remainder

         int b=39;

         b%=7 ;

        System.out.println("b = " + b); //=4











    }




}
