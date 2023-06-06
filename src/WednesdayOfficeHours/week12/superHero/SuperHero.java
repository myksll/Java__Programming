package WednesdayOfficeHours.week12.superHero;

import java.util.ArrayList;

public class SuperHero {

    //instance

    private String superHeroName;
    private String realName;
    private String universe;  //make universe?
    private ArrayList<String> powers;

    //constructor
    public SuperHero(String superHeroName, String realName,ArrayList<String> powers) {
       setSuperHeroName(superHeroName);
       setRealName(realName);
       setUniverse(getClass().getSimpleName());//this.universe = getClass ().getSimpleName();
       setPowers(new ArrayList<>(powers));  //this.powers = new ArrayList<(powers);
    }

    //setter getter
    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    //methods
    public void protect(){
        System.out.println(superHeroName+ "  protecting");
    }
//toString
    @Override
    public String toString() {
        return   superHeroName+ " from "+ universe+ " They have these powers:\n" + powers;
    }
}
