package WednesdayOfficeHours.week12.candyClass;

public class CandyFactory {
    public static void main(String[] args) {


        Candy candy = new Candy("Kent",100000,false);
        System.out.println(candy);

        candy.setQuantity(25000);
        System.out.println(candy.getQuantity());

        System.out.println("----------------------------------------------------");

        Take5 take5 = new Take5(10000,true);
        System.out.println(take5);

        System.out.println("----------------------------------------------------");

        Twix twix = new Twix(10000,true);
        System.out.println(twix);

        System.out.println(twix.countryLargestCandyConsumption);

        System.out.println( Twix.countryLargestCandyConsumption);


        System.out.println("----------------------------------------------------");

        HersheyBar hersheyBar = new HersheyBar("Hershey Bar",50000);
        System.out.println(hersheyBar);

        System.out.println("----------------------------------------------------");




    }
}
