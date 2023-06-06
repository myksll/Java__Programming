package SundayLiveClass.week11.access_a;

public class Computer {

    public String os;
    protected double memory;
    String brand;
    private boolean hasWifiCard;


    /* Constructor
    public Computer(String os, double memory, String brand, boolean hasWifiCard) {
        this.os = os;
        this.memory = memory;
        this.brand = brand;
        setHasWifiCard(hasWifiCard);
    }

    //((setter getter))
    public boolean isHasWifiCard() {
        return hasWifiCard;
    }

    public void setHasWifiCard(boolean hasWifiCard) {
        this.hasWifiCard = hasWifiCard;
    }
     */


    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifiCard=" + hasWifiCard +
                '}';
    }
}
