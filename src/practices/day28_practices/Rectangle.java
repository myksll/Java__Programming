package practices.day28_practices;

public class Rectangle {

    private double length, width;

    public double getLength() {
        return length;
    }

    public Rectangle(double length, double width) {
        setLength(length);
       setWidth(width);
    }

    //setters getters
    public void setLength(double length) {
        if(length<=0){
            System.err.println("invalid length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("invalid width: "+ width);
            System.exit(1);
        }
        this.width = width;
    }

    //methods

    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return (width+length)*2;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" +calcPerimeter() +
                '}';
    }
}
