package dailyVideos.day31__inheritance.shape_MethodOverriding;

public class Circle extends Shape {

    private double radius;

    //constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    //setter getter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    //methods to be overridden
    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 6.28 * radius;
    }

    @Override
    public void draw() {
        super.draw();
        //code fragments that can draw a circle

    }

    //toString
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", radius'" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';

    }
}