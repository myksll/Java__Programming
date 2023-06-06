package dailyVideos.day36_polymorphism;

public class TestEqualsMethods {


    public static void main(String[] args) {


        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); //false-->they are not same object in the heap memory

        System.out.println(circle1.equals(circle2)); //true

        System.out.println(circle1.equals(circle3)); //false

        System.out.println("-------------------------------------------------");

        //IPhone

        IPhone iPhone1 = new IPhone("Apple","IPhone 12","Medium","Black",900);

        IPhone iPhone2 = new IPhone("Apple","IPhone 12","Medium","White",900);


        System.out.println(iPhone1.equals(circle1));//false , because circle1 is not object of IPhone

        System.out.println(iPhone1.equals(iPhone2));//false , because model and color are not same in two objects







    }
}
