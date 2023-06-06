package practices.day30_practices.deviceTask;



public class MyDevices {

    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone", "14", "White","Large" , 1000, false, true);


        System.out.println(iphone.isHasBattery());

        System.out.println("-------------------------------------------------");


      SmartTV smartTv = new SmartTV("Samsung", "Class S95C", "Black", "75\"",2500,false,true);
        System.out.println(smartTv);
        smartTv.setColor("Gray");
        System.out.println(smartTv);

        System.out.println("----------");


    }


}
