package practices.day07_practices;

public class CappuccinoBuyer {

    public static void main(String[] args) {


        String validSize= "tall";
        int calories=0;
        double price=0.0;

        if(validSize=="tall" || validSize=="grande" || validSize=="venti"){

            if(validSize=="tall") {
                price = 3.69;
                calories = 90;
            }else if(validSize=="grande"){
                price=3.99;
                calories=120;
            }else {
                price = 4.29;
                calories = 150;
            }
                System.out.println("price is: $"+price+"\n"+calories+" calories" );


            }else {
                System.out.println("Invalid Size: "+ validSize);
            }


            }

        }
























