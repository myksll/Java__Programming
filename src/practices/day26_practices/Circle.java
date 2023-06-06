package practices.day26_practices;

public class Circle {

    //instance

    public double radius;
    public double diameter;

    //static

    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
    }

    public double calcArea() {
        return radius * radius * pi ;
    }

    public double calcPerimeter() {
        return diameter * pi ;
    }

    public static double printPi(){
        return pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + printPi()+
                ", area=" +calcArea() +
                ", Perimeter =" + calcPerimeter() +
                '}';
    }
}
