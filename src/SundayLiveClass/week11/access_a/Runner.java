package SundayLiveClass.week11.access_a;

public class Runner {
    public static void main(String[] args) {

        Windows windows=new Windows();//"Windows",16,"Samsung",false)

        System.out.println(windows.os);
        System.out.println(windows.memory);
        System.out.println(windows.brand);
       // System.out.println(windows.hasWifiCard); private can not be accessible in different class in same package without setter and getter






    }
}
