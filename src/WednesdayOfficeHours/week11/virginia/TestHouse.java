package WednesdayOfficeHours.week11.virginia;

public class TestHouse {

    public static void main(String[] args) {

        House obj = new House();

        obj.address="1000 N lane ";
        obj.price=100_000;
        obj.neighborhoodName="Beery Hills";
       // obj.ownerName="James Bond";--> private is not accessible



        /*
        House house =new House();

        System.out.println(house.address);  //public is accessible in different class ,in same package
        System.out.println(house.price); //protected is accessible in different class ,in same package
        System.out.println(house.neighborhoodName);//default is accessible in different class ,in same package

        //System.out.println(house.ownerName); private is not accessible in the different class in same package
         */

    }

}
