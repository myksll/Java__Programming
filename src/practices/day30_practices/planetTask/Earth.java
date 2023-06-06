package practices.day30_practices.planetTask;

public class Earth extends Planet{


    private boolean  isLivable;

    public Earth( double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population, boolean isLivable) {
        super("Earth", mass, radius, surfaceGravity, surfaceArea, volume, population);
        this.isLivable = isLivable;
    }

    //setter getter
    public boolean isLivable() {
        return isLivable;
    }

    public void setLivable(boolean livable) {
        isLivable = livable;
    }




}
