package SundayLiveClass.week11.access_b;

import SundayLiveClass.week11.access_a.Computer;

public class Mac extends Computer {

/*    public Mac(String os, double memory, String brand, boolean hasWifiCard) {
        super(os, memory, brand, hasWifiCard);
    }
 */

    public static void main(String[] args) {

        Mac mac=new Mac();

        System.out.println(mac.os);
        System.out.println(mac.memory);

       //System.out.println(mac.brand;  //default and private can be not accessible in same class in different package
      // System.out.println(mac.hasWifiCard);



    }
}
