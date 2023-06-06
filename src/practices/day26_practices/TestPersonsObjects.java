package practices.day26_practices;

public class TestPersonsObjects {

    public static void main(String[] args) {


        Persons persons1= new Persons("Shokida", 35,'F');

        System.out.println(persons1);

        persons1.eat("Hamburger");//Shokida is eating Hamburger
        persons1.drink("Water"); //Shokida is drinking Water
        persons1.sleep();//Shokida is sleeping


        System.out.println(persons1.numberOfHead);//1




    }
}
