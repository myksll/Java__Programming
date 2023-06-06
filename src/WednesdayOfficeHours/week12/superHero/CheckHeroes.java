package WednesdayOfficeHours.week12.superHero;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckHeroes {

    public static void main(String[] args) {


        Marvel spiderman = new Marvel("Spider Man", "Peter Parker ", new ArrayList<>(Arrays.asList("Enhanced strength, agility, and spider-sense")));

        System.out.println(spiderman);

        spiderman.callAvengers();

        spiderman.setUniverse("Multiverse");
        System.out.println(spiderman.getUniverse());

        System.out.println("-----------------------------------------------------------------------");

        ArrayList<String>tonyPowers=new ArrayList<>(Arrays.asList("powered suit of armor, flight, enhanced strength"));

        Marvel ironman = new Marvel("Iron man", "Tony Stark",tonyPowers);

        System.out.println(ironman);
        ironman.callAvengers();
        ironman.protect();

        System.out.println("-----------------------------------------------------------------------");

        Marvel thor = new Marvel("Thor", "Thor Odinson",new ArrayList<>(Arrays.asList("wields hammer, controls lightning, flight")));

        System.out.println(thor);

        System.out.println("-----------------------------------------------------------------------");


         DC wonderWoman =new DC("Wonder woman","diana prince", new ArrayList<>(Arrays.asList("Enhanced strength, speed, agility, durability")));



    }

}
