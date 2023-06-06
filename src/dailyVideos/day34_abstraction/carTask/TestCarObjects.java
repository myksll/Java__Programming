package dailyVideos.day34_abstraction.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

        //Car car1 = new Car("X6", "Red",2020,45000); if it is abstract class , we can not do object. parent class can not be object

        Honda honda =new Honda ("Pilot", "Black",2019, 35000);
        Audi audi =new Audi("Q6", "Silver", 2020,36000);
        Tesla tesla = new Tesla("Model Y", "Blue", 2022,60000);

        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(honda);

        System.out.println("---------------------------------------------------------------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("---------------------------------------------------------------------------------------------");

        honda.start();
        tesla.start();
        audi.start();

        System.out.println("---------------------------------------------------------------------------------------------");

        audi.autoPark();
        tesla.autoPilot();




    }

}
