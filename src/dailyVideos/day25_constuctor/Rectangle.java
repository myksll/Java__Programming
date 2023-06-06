package dailyVideos.day25_constuctor;

public class Rectangle {  //default constructor


    public double length, width;


    public  void setInfo(double length, double width){
        this.length=length;  //  this.length(instance variable)=length;(argument)
        this.width=width;
    }


    public double area(){
        return length*width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area()+
                '}';
    }

}
