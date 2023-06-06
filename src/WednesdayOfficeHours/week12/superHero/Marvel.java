package WednesdayOfficeHours.week12.superHero;

import java.util.ArrayList;

public class Marvel extends SuperHero{


    public Marvel(String superHeroName, String realName, ArrayList<String> powers) {
        super(superHeroName, realName, powers);
    }

    public void callAvengers(){
        System.out.println("Calling all avengers");
    }

    @Override
    public void protect() {
        super.protect();  //I will change only a part of parent class method
        System.out.println("by any means necessary");


    }
}
