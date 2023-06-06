package SundayLiveClass.week10.TrafficLight;

public class TrafficLight {

   private String color;


    public TrafficLight(String color) {
       setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        boolean hasColor= color.equals("green") || color.equals("red") || color.equals("yellow") ;

        if(!hasColor){
            System.err.println("Invalid color:" +color);
            System.exit(1);
        }

        this.color = color;
    }


    public String toString() {
        return "TrafficLight{" +
                "color='" + color + '\'' +
                '}';
    }
}
