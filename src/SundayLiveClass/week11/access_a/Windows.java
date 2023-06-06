package SundayLiveClass.week11.access_a;

public class Windows extends Computer{

    public static void main(String[] args) {

        Windows windows=new Windows();
        System.out.println(windows);

        System.out.println(windows.os);
        System.out.println( windows.brand);
        System.out.println(windows.memory);


       // private can not be accessible in different class in same package.
       // System.out.println(windows.hasWifiCard); Private is not inherited
    }
}
