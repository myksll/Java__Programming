package dailyVideos.day30_inheritance.phoneTask;

public class IPhone extends Phone {  //IPhone is a Phone


    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public static boolean hasApplePay=true;



    public void faceTime(long phoneNumber){
        System.out.println( getModel()+ " is face timing with " + phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel()+ " is face timing with " + email );
    }


}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)



//we need to call IPhone constructor through super keyword
    public IPhone(String brand, String model, String size, double price, String color){
       // this();   //-->if we are calling the constructor (from parent class), but we have a super keyword

        super("Apple", model, size, price, color);//super() keyword call Parent class constructor from child class constructor
        //we know brand of IPhone, so we can write directly Apple

 */