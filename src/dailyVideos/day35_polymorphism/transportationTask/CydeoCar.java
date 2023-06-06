package dailyVideos.day35_polymorphism.transportationTask;

import dailyVideos.day34_abstraction.animalTask.Flyable;
import dailyVideos.day34_abstraction.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable,Electric,AutoPilot, Swimmable {


    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
