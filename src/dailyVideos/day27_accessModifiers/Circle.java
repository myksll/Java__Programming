package dailyVideos.day27_accessModifiers;

import java.util.Date;

public class Circle {

    public double radius, diameter;
    public static double pi;

    static{
        pi =3.14;
    }


    public Circle (double radius){
        this.radius = radius; // (radius is local variable, but this.radius is instance variable
         diameter = radius * 2;
    }

       /*
       public static double calcArea(){ //static: we call class name of static
          return radius * radius * pi;   //static method does not accept instance variable, so it gives compiler error
       }
        */

    public double calcArea(){  //we call object name
      return radius * radius * pi;//instance method accepts static and instance variable,because all of them belong to object,object members
    }

    public double calcPerimeter(){
        return diameter * pi ;
    }

    public static void printPiValue(){
        System.out.println("PI' value is: "+ pi);
    }

    public String toString() {  //toString method is also instance method
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area of circle=" + calcArea() +
                ", perimeter of circle=" + calcPerimeter() +
                '}';
    }




}
/*
 Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement

 */