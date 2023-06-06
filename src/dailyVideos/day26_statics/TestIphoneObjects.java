package dailyVideos.day26_statics;

public class TestIphoneObjects {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone12","Black",1000);

        //instance objects
        System.out.println(iPhone.color);//Black
        System.out.println(iPhone.price);//1000
        System.out.println(iPhone.model);//iPhone12

        //static objects
        iPhone.printPhoneInfo(); //Brand:Apple Model: iPhone12 Color: Black Price: 1000

        System.out.println(IPhone.brand);//Apple

        IPhone.printOperatingSystem();//Operating system: iOS ,where to be produced : China, Battery true ,Touch Screen: true ,is expensive to fix :true

        System.out.println(IPhone.OS);//iOS   //with class name, we can print static methods









    }
}
