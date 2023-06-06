package dailyVideos.day31__inheritance.shape_MethodOverriding;

public class Square extends Shape {

    private double side;


    //constructor
    public Square(double side) {
        setSide(side);
    }

    //setter getter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw();//we want to use same code with Parent class

        System.out.println("\t * * * * * *"); //to draw a square shape
        for (int i = 0; i < 4; i++){
            System.out.println("\t *         *");
        }
        System.out.println("\t * * * * * *");
    }

    //toString
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", side'" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';


    }
}