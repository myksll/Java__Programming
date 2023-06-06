package practices.day28_practices;

public class TestPerimeter {
    public static void main(String[] args) {

        Square square1 = new Square(2);

        System.out.println(square1);

        square1.calcPerimeter();

        square1.setSide(5);
        System.out.println(square1.getSide());

        System.out.println(square1);








    }
}
