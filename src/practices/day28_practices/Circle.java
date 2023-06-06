package practices.day28_practices;

public class Circle {

    //instance-->private
    private double radius ;

    //public-->static
    public static double pi;

    //Constructor~Setters
    public Circle(double radius) {
     setRadius(radius);
    }

    //-------------------------------------------------------------

    //Static
    static {
        pi = Math.PI; //3,14444.....
    }

    //-------------------------------------------------------------
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if( radius<=0){
            System.err.println("Radius can not be zero or negative");
            System.exit(1);
        }
        this.radius = radius;
    }
    //-------------------------------------------------------------

    //methods

    public double calcArea(){
      return radius * radius * Math.PI;
    }

    public double calcPerimeter(){
        return radius * 2 * Math.PI;
    }

    //--------------------------------------------------------------
    //toString()

    public String toString() {
        return "Circle{" +
                "radius= " + radius+"\t" +
                "areas= " + calcArea()+"\t"+
                "perimeter= " + calcPerimeter()+
                '}';
    }
}

