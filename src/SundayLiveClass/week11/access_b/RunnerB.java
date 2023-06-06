package SundayLiveClass.week11.access_b;

public class RunnerB {  //no inheritance

    public static void main(String[] args) {

        Mac mac =new Mac();//"IOS",64,"Apple", true

        System.out.println(mac.os);

        //Protected, default , private can not be accessible in different class, in different package

       /* System.out.println(mac.memory);--> protected is inherited in subclass, ut it can not be
        System.out.println(mac.brand);
        System.out.println(mac.hasWifiCard);
        */









    }


}
