package WednesdayOfficeHours.week12.seasonClass;

public class Fall extends Season{

    public Fall(double highestAverageTemperature, double lowestAverageTemperature) {
        super(highestAverageTemperature, lowestAverageTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Read a book");
    }
}
