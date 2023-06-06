package practices.day30_practices.planetTask;

public class Moon extends Planet{

    private String alternativeNames; //luna


    //constructor
    public Moon(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population, String alternativeNames) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
        this.alternativeNames = alternativeNames;
    }


    //setter getter
    public String getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(String alternativeNames) {
        this.alternativeNames = alternativeNames;
    }
}
