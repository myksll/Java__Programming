package WednesdayOfficeHours.week12.seasonClass;

public class Spring extends Season{

    public Spring(double highestAverageTemperature, double lowestAverageTemperature) {
        super(highestAverageTemperature, lowestAverageTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside");
    }
}
