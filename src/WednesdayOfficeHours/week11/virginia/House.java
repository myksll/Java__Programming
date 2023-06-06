package WednesdayOfficeHours.week11.virginia;

public class House {

    public String address; //public

    protected  double price; //protected

    String neighborhoodName; //default

    private String ownerName; //private


    public static void main(String[] args) {

        House obj = new House();

        obj.address="1000 N lane ";
        obj.price=100_000;
        obj.neighborhoodName="Beery Hills";
        obj.ownerName="James Bond";



    }

}
