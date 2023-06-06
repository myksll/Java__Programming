package WednesdayOfficeHours.week11.california;

import WednesdayOfficeHours.week11.virginia.House;

public class TestCalifornia {

    public static void main(String[] args) {



        House obj = new House();

        obj.address="1000 N lane ";//only public is accessible in a different package

        //private, default, protected are not accessible
        //obj.price=100_000;
        //obj.neighborhoodName="Beery Hills";
        // obj.ownerName="James Bond";-->











        /*House house1 = new House();

        System.out.println(house1.address); //only public can be accessed in different package ib different class

       /* we can not access default, protected, private access modifier in different class, in different package
        System.out.println(house1.price);
        System.out.println(house1.neighborhoodName);
        System.out.println(house1.ownerName);
       */




    }
}
