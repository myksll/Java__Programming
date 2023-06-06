package dailyVideos.day25_constuctor;

public class TestRectangleObjects {
    public static void main(String[] args) {

        Rectangle rectangle1=new Rectangle();
        System.out.println(rectangle1); //Rectangle{length=0.0, width=0.0, area=0.0}
        rectangle1.setInfo(12,15);  //Rectangle{length=12.0, width=15.0, area=180.0}

        Rectangle rectangle2=new Rectangle();//->we have to write setINFO METHOD MANUALLY
        rectangle2.setInfo(2,5);

        Rectangle rectangle3=new Rectangle();
        rectangle3.setInfo(2,15);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);













    }
}
