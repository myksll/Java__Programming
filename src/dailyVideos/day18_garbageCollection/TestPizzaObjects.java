package dailyVideos.day18_garbageCollection;

public class TestPizzaObjects {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza();

        pizza1.size='s';  // long way
        pizza1.numberOfCheeseTopping=5;
        pizza1.numberOfPepperoniTopping=2;

        System.out.println(pizza1);


        Pizza pizza2= new Pizza();

        pizza2.SetInfo('m',5,4);  // easy way

        System.out.println(pizza2);

        System.out.println("-----------------------------------------------------------------");

        double total=0;


        for (int i = 0; i < 20; i++) {

            Pizza small= new Pizza();
            small.SetInfo('s',2,2);
           total += small.calcCost();


            Pizza medium= new Pizza();
            medium.SetInfo('m',3,4);
            total += medium.calcCost();

            Pizza large= new Pizza();
            large.SetInfo('l',4,5);
            total += large.calcCost();

        }



        System.out.println("total = " + total);
    }
}
