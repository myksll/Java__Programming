package SundayLiveClass.week13.buildingPart1;

import java.util.ArrayList;
import java.util.Arrays;

public class RealEstate {
    public static void main(String[] args) {


        House house1=new House("McLean",300_000,4); //reference of itself

        System.out.println(house1.price);
        System.out.println(house1.location);
        System.out.println(house1.numberOfResidents);
        System.out.println(house1);
        house1.pay();
        house1.mowLawn();

        Building building1 = house1;//upcasting = automatically
        
        Building house2=new House("Chicago",200_000,5); //reference of a super class

        System.out.println(house2.price);
        System.out.println(house2.location);
        
      // System.out.println(house2.numberOfResidents); that is unique variable to the House
        System.out.println(((House)house2).numberOfResidents); //down casting -->Building reference does not access to this variable
        
        System.out.println(house2);
        
        house2.pay();
        
       //house2.mowLawn();
       // System.out.println( ((House)house2).mowLawn);
        ((HasBackyard) house2).mowLawn();

        House house3 =(House) house2;//down-casting-->Building-->House


        System.out.println("------------------------------------------------------------");
        ArrayList<Building> allBuildings = new ArrayList<>(Arrays.asList(
                
                house1,house2,
                new OfficeBuilding("FairFax",10-000-000,30),
                new OfficeBuilding("LA",100-000-000,40),
                new House("Maine",80_000,2)
                
        ));
        
        for(Building each : allBuildings){
            each.pay();
        }

        for(Building each : allBuildings){
            System.out.println(  BuildingUtil.Rent(each));
        }

        System.out.println("------------------------------------------------------------");
        // Find the most expensive Building, print all its information
        Building  max = allBuildings.get(0);
        for(Building each : allBuildings){
          if(each.price > max.price){
              max = each;
          }
        }
        System.out.println(max); //false

        System.out.println("----------------------------------------------------------");
        ArrayList<Building> toFilter =new ArrayList<>(allBuildings);
        toFilter.removeIf(p->  p.price>= 1_000_000);
        System.out.println(toFilter);

        System.out.println("----------------------------------------------------------");


        
    }
}
