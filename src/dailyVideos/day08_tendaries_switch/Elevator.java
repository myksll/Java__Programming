package dailyVideos.day08_tendaries_switch;

public class Elevator {

    public static void main(String[] args) {


        int floorNum=3;

     /* 1. solution
        if (floorNum==1){
            System.out.println("Floor 1 selected. Companies: Lobby,Verizon,Starbucks");
        }else if(floorNum==2){
            System.out.println("Floor 2 selected. Companies: Cydeo,NASA, Intelsat");
        }else if(floorNum==3){
            System.out.println("Floor 3 selected. Companies: Lyft,BofA, Stake house");
        }else{
            System.out.println("Invalid floor");
        }





      */
/*2.solution
if(floorNum>=1 && floorNum<=3) {

    if (floorNum == 1) {
        System.out.println("Floor 1 selected. Companies: Lobby,Verizon,Starbucks");
    } else if (floorNum == 2) {
        System.out.println("Floor 2 selected. Companies: Cydeo,NASA, Intelsat");
    } else {
        System.out.println("Floor 3 selected. Companies: Lyft,BofA, Stake house");
    }

     } else {
    System.out.println("Invalid floor");
}
 */


             String result="Invalid floor";

        if(floorNum>=1 && floorNum<=3) {
                  result= "Floor "+floorNum+ " is selected. Companies: ";
            if (floorNum == 1) {
              result += "Lobby,Verizon,Starbucks";
            } else if (floorNum == 2) {
               result+="Cydeo,NASA, Intelsat";
            } else {
                result+= "Lyft,BofA, Stake house";
            }

        }

        System.out.println(result);






    }
}
