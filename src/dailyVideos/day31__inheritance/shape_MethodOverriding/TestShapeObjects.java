package dailyVideos.day31__inheritance.shape_MethodOverriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);

        square.area();
        square.perimeter();
        square.draw();

        System.out.println("------------------------------------------------");

        Circle circle = new Circle(3.5);
        System.out.println(circle);

        circle.draw();

        System.out.println("------------------------------------------------");

    }
}
