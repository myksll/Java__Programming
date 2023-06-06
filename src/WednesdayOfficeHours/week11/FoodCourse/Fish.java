package WednesdayOfficeHours.week11.FoodCourse;

public class Fish extends Entree{

    private String fishType;

    public Fish(String fishType) {
        this.fishType = fishType;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }


}
