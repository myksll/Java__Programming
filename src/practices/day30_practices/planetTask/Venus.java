package practices.day30_practices.planetTask;

public class Venus extends Planet{


    private double distanceFromSun; //66,784 million km

    //constructor
    public Venus(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population, double distanceFromSun) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
        this.distanceFromSun = distanceFromSun;
    }

    //setter getter
    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }
}
