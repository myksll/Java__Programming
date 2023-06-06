package WednesdayOfficeHours.week12.superHero;

import java.util.ArrayList;

public class DC extends SuperHero{

    private String city;

    public DC(String superHeroName, String realName,ArrayList<String> powers) {
        super(superHeroName, realName, powers);
      setCity(city);
    }

    //setter getter
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //method


    @Override
    public void protect() {
        super.protect();  //I will change only a part of parent class method
        System.out.println("by any means necessary");

    }
}
