package dailyVideos.day36_polymorphism;

import practices.day28_practices.Rectangle;

public class Circle {

    private double radius;
    public final static double PI= 3.14;

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

    //methods
    public double area(){
        return radius * radius *PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    //toString
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }


    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Circle)){ //if the specified object is not circle, then we should not compare them
            System.err.println("Invalid Object");
            System.exit(1);
        }

        if(this.radius  == ((Circle) obj).radius){ //if the current circle' radius is equal to the given circle's radius, then two circles are equal.
            return true;
        }
           return false;


    }
}
