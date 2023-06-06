package dailyVideos.day25_constuctor;

public class RectangleConstructors {

    public double length, width;

    public RectangleConstructors(double length,double width){

        this.length=length;
        this.width=width;

    }

    public double area() {
        return length * width;
    }

        public String toString() {
            return "Rectangle{" +
                    "length=" + length +
                    ", width=" + width +
                    ", area=" + area() +
                    '}';
        }
    }
