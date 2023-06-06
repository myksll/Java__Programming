package dailyVideos.day35_polymorphism.transportationTask;

public class Tesla extends Car implements Electric,AutoPilot{


    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {

    }


    @Override
    public void charge() {
        System.out.println("super charging");
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void selfDrive() {

    }
}
