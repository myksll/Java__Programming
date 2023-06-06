package WednesdayOfficeHours.week12.seasonClass;

public class Season {

    private String name;
    private double highestAverageTemperature;
    private double lowestAverageTemperature;

    //constructor
    public Season( double highestAverageTemperature, double lowestAverageTemperature) {
       setName(getClass().getSimpleName());
       setHighestAverageTemperature(highestAverageTemperature);
       setLowestAverageTemperature(lowestAverageTemperature);
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHighestAverageTemperature() {
        return highestAverageTemperature;
    }

    public void setHighestAverageTemperature(double highestAverageTemperature) {
        this.highestAverageTemperature = highestAverageTemperature;
    }

    public double getLowestAverageTemperature() {
        return lowestAverageTemperature;
    }

    public void setLowestAverageTemperature(double lowestAverageTemperature) {
        this.lowestAverageTemperature = lowestAverageTemperature;
    }

    //methods
    public void activity(){
        System.out.println("We are doing activities on " + name);
    }

    //toString
    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", highestAverageTemperature=" + highestAverageTemperature +
                ", lowestAverageTemperature=" + lowestAverageTemperature +
                '}';
    }
}
