package SundayLiveClass.week2;

public class Pizza {
    public static void main(String[] args) {


           String type= "cheese";
           int slices= 10;
           int people=5;



           String summary= " We ordered a "+ type+ " pizza with "+ slices+" slices."+ people+" people ate "+(slices/people)+

             " slices each so there was "+ (slices%people)+" slices left";


        System.out.println(summary);















    }
}
