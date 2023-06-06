package practices.day30_practices.planetTask;

public class TestPlanet {
    public static void main(String[] args) {

        Planet planet1 = new Planet("Mars", 6.4,3.389,3.720,	144.37,1.631,0);
        System.out.println(planet1);

        planet1.setName("MARS");
        System.out.println(planet1.getName());

        System.out.println("-----------------------------------------------");

        Earth obj1 = new Earth(	5.972,	6.371,	9.806,510.072,20.95,7.837,true );

        obj1.setVolume(23.1);
        System.out.println(obj1.getVolume());



    }
}
