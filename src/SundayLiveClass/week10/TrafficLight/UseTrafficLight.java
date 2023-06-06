package SundayLiveClass.week10.TrafficLight;

import java.io.PrintStream;

public class UseTrafficLight {
    public static void main(String[] args) {

        TrafficLight light1= new TrafficLight("red");

        light1.setColor("yellow");
        System.out.println(light1.getColor());

        light1.setColor("pink");
        System.out.println(light1.getColor());


    }
}
