package SundayLiveClass.week13.buildingPart1;

public abstract class Building {

    String location;
     double price;

    public abstract void pay();

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }

    @Override
    public String toString() {
        return location + " , costs $" + price;


    }




}
