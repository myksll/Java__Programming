package dailyVideos.day37_exceptions;

import dailyVideos.day36_polymorphism.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);

        Pizza pizza2 = new Pizza('S',2,3);

        System.out.println(pizza1==pizza2); //false

       // System.out.println(pizza1.equals("Pizza"));// Invalid object: Pizza->.equals method accepts any other object, but we can write our conditions for equal method in parent class

        System.out.println(pizza1.equals(pizza2));//true

        //upcasting -<we need to access the features only unique in object type(pizza)
        Object obj = new Pizza('S',4,3);

        //obj.calCost(); we can not call calCost()method, because it is unique for PIZZA CLASS  ( OBJECT)

        boolean r = obj.equals(pizza2);
        System.out.println(r);

        double total = ((Pizza)obj).calcCost();
        System.out.println(total);

       /* //can pizza be converted to Circle?
        double area = ((Circle)obj).area();//.ClassCastException--> if there is no relation , it gives this error
        System.out.println( area);
        */







    }
}
