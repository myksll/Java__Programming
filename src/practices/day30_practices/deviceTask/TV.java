package practices.day30_practices.deviceTask;

public class TV extends Device{
    public TV(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }


    public void channelUp(){
        System.out.println("Channel up"+ getBrand()+" "+getModel() );
    }

    public void channelDown(){
        System.out.println(" Channel down"+getBrand()+" "+getModel());
    }






}
