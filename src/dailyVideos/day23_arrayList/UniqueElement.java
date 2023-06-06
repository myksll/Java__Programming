package dailyVideos.day23_arrayList;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("Vasyl");   //0
        names.add("Vasyl");   //1
        names.add("Sumeyye"); //2
        names.add("Sumeyye"); //3
        names.add("Ali");     //4
        names.add("Sumeyye"); //5
        names.add("Shukir");  //6
        names.add("Marika");  //7



        for(String each : names){

            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each); //Ali  Shukir Marika
                break;  //if we  want to first unique element , use break. //Ali
            }
        }












    }
}
