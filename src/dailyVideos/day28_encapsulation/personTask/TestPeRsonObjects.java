package dailyVideos.day28_encapsulation.personTask;

public class TestPeRsonObjects {
    public static void main(String[] args) {

        PeRson person1 =new PeRson("Khauthsi" );  //name
        PeRson person2 =new PeRson("Abido",'M'); //name, gender
        PeRson person3 =new PeRson("Sumettra",29 ); //name, age
        PeRson person4 =new PeRson("Daniel","English" ); //name, language
        PeRson person5 =new PeRson("Danilele",26,'F' ); //name, age, gender
        PeRson person6 =new PeRson("Lucy",30,'F' ,"English"); //name, age, gender, language


        person4.name="James";  //instance

        //person1.planet = "Mars"; //static  all objects are Mars now . --->to call static, it is not good way
        PeRson.planet="Mars";   // wa call static from the class (PeRson)


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        PeRson.printPlanetName();  //Planet name is Mars

        person1.eat("Baklava"); //Khauthsi is eating Baklava  //instance
        person2.drink("Water"); //Abido is drinking Water




    }
}
