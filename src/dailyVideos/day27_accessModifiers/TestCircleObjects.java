package dailyVideos.day27_accessModifiers;

public class TestCircleObjects {
    public static void main(String[] args) {


        Circle circle1 = new Circle(5.4);
        System.out.println(circle1.toString());
        //Circle{radius=5.4, diameter=10.8, PI=3.14, area of circle=91.56240000000001, perimeter of circle=33.912000000000006}

        Circle circle2 = new Circle(5);
        System.out.println(circle2.toString());
        //Circle{radius=5.0, diameter=10.0, PI=3.14, area of circle=78.5, perimeter of circle=31.400000000000002}

        System.out.println(circle1.pi); //3.14
        System.out.println(circle2.pi); //3.14  we should not   call static class through  objects(the class1) that is not option

   //!!! right way---> static should be called through the class name
        System.out.println( Circle.pi);//3.14

   //!!! but we can not call objects through class name ---> System.out.println(Circle.radius); //-->it gives compiler error

    }
}
