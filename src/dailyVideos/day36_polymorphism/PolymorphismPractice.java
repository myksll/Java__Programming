package dailyVideos.day36_polymorphism;

import dailyVideos.day30_inheritance.phoneTask.IPhone;
import dailyVideos.day30_inheritance.phoneTask.Nokia;
import dailyVideos.day30_inheritance.phoneTask.Phone;
import dailyVideos.day30_inheritance.phoneTask.Samsung;

public class PolymorphismPractice {


    public static void main(String[] args) {


    //IPhone Phone = new Phone(); child can not be reference to the parent
    //Phone phone =  new IPhone("Iphone 11 Pro", "Large",  900,"Black");//parent can be reference to the child

     Phone[] phones = {
            new IPhone("Iphone 11 Pro", "Large", 900, "Black"),
            new IPhone("Iphone 12 Pro Max", "Large", 1200, "Black"),
            new IPhone("Iphone 9", "Medium" , 800 ,"Gold"),
            new Samsung("Galaxy S19", "Medium", 700, "Pink"),
            new Samsung("Galaxy S20", "Large", 850, "Silver"),
            new Samsung("Galaxy S21", "Large", 950, "Black"),
            new Nokia("XR20", "Small", "Black", 350),
            new Nokia("G10", "Medium", "Black", 99),
            new Nokia("G50", "Large", "Silver", 250),
            new IPhone("Iphone 12 Pro", "Large", 1200, "Black"),
            new IPhone("Iphone 11 Pro Max", "Large", 1100, "Silver"),
            new Samsung("Galaxy S18", "Medium", 750, "White"),
            new Samsung("Galaxy S17", "Large", 650, "Silver"),
            new Nokia("G10", "Medium", "Black", 99),
            new IPhone("Iphone 6", "Smalle", 400, "Gold"),
            new IPhone("Iphone 7", "Smalle",500, "White")
    };


        // model - color - price
        for(Phone eachPhone : phones){
        System.out.println(eachPhone.getModel() +" - "+eachPhone.getColor() +" - "+ eachPhone.getPrice());
    }


        System.out.println("------------------------------------------------------------------------------");
         // 2. How many Iphones in the array of phones?
        //3. How many Samsungs in the array of phones?

        int countIphone=0;
        int countNokia=0;
        int countSamsung=0;

        for( Phone each :phones){
            if(each instanceof  IPhone){
                countIphone++;
            }else if(each instanceof Samsung){
                countSamsung++;
            }else{
                countNokia++;
            }
        }

        System.out.println("countSamsung = " + countSamsung);
        System.out.println("countIphone = " + countIphone);
        System.out.println("countNokia = " + countNokia);

        System.out.println("------------------------------------------------------------------------------");
        //4. Display the models of Iphones and samsung that has the price of 700 or greater

        for (Phone each : phones) {
            if(each instanceof IPhone || each instanceof Samsung){ //if the phone is Iphone or Samsung
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }

// == -->it is not weise choice instead .equal()


   }


}
/*
Given the following array:



    1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater

 */