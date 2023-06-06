package SundayLiveClass.week13.buildingPart1;

public class BuildingUtil {

    public static double Rent(Building building){
        if(building instanceof House){
          return   building.price / 360 * 2;
        }else if(building instanceof  OfficeBuilding){
            return building.price /1000;
        } //note: we did not create the Apartment

        return -1 ; //if the building is not house or office building it returns -1


    }

    public static Building  search(String location){
        if(location.equals("Great Falls")){
            return new House("Great Falls",500_000,4);
        }else if(location.equals("McLean")){
            return new OfficeBuilding("McLean",3_000_000,6);

            }
            return null;
        }

    }


