package SundayLiveClass.week2;

public class CellPhone {
    public static void main(String[] args) {


        String brand="Apple",
                model= "IPhone",
                color="Black";
        double price =1200.99;
       int storage =128 ;

       boolean hasCamera=true;
       char simType= 'A';

        System.out.println("We have a brand new "+model+" from "+ brand);
        System.out.println("It comes in the color "+ color+ " and has "+storage+"GB memory");
        System.out.println("Has a camera: " +hasCamera+ " and operates with the \""+simType+"\" type sim");
        System.out.println("Get your very own "+model+" X for only $"+price);
        System.out.println("------------------------------------------------------------------------------------");


String ad="We have a brand new "+model+" from "+ brand+
        "\nIt comes in the color "+ color+ " and has "+storage+"GB memory"+
        "\nHas a camera: " +hasCamera+ " and operates with the \""+simType+"\" type sim"+
        "\nGet your very own "+model+" X for only $"+price;

        System.out.println(ad);





















    }
}
