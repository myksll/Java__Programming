package WednesdayOfficeHours.week12.candyClass;

public class Candy {

    //instance
    private String brand;
    private int quantity;
    private boolean containsPeanuts;

    //static
    public static double totalCandy=500000;
    public static String countryLargestCandyConsumption="United States";
/*
    static{
        totalCandy=500000;
        countryLargestCandyConsumption="United States";
    }

 */

    //constructor
    public Candy(String brand, int quantity, boolean containsPeanuts) {
       setBrand(getClass().getSimpleName());
       setQuantity(quantity);
       setContainsPeanuts(containsPeanuts);
    }

    //setter getter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isContainsPeanuts() {
        return containsPeanuts;
    }

    public void setContainsPeanuts(boolean containsPeanuts) {
        this.containsPeanuts = containsPeanuts;
    }

    //toString
    @Override
    public String toString() {
        return  " I have "+ quantity+ " "+brand+" which "+ (containsPeanuts ? "has " : "doesn't have ")+ " peanuts";
    }
}
