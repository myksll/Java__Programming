package WednesdayOfficeHours.week11.country;

public class Country {

    //static
    public static String planet;
    public static double worldPopulation; //represents in billions
    public static double worldCo2Level;   //represent in ppm

    //instance
    public String name;
    public double population;//represents in millions
    public String continent;


    //constructor
    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    //static
    static{
        planet="Earth";
        worldPopulation=7.88;
        worldCo2Level=417.83;
    }


    public static void countryInfo(){
        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation+" billion");
        System.out.println(Country.worldCo2Level+" ppm");
    }

    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                " million, continent='" + continent + '\'' +
                " , planet='" + planet + '\'' +
                ", world population='" +worldPopulation + '\'' +
                ",world Co2 Level='" + worldCo2Level + '\'' +
                '}';
    }
}
