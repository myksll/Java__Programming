package WednesdayOfficeHours.week11.country;

public class UsingCountry {
    public static void main(String[] args) {

        Country country1 = new Country("German",80, "Europe");
        System.out.println(country1);

        //instance
        System.out.println(country1.name);
        System.out.println(country1.population);
        System.out.println(country1.continent);

        //static
        System.out.println(Country.planet);

        //method
        Country.countryInfo();

        //Country.name;  name is an instance variable ., so it can not be accessed in a static way


    }
}
