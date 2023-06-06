package dailyVideos.day26_statics;

public class IPhone {

    public static String brand= "Apple"; //static: all the IPhone object's brand is Apple
    public String model, color; //instance: different models, colors and prices for IPhone objects
    public int price;
    public static String OS="iOS";   //static: all the IPhone object's OS is IOS
    public static String madeIn="China";  //static: all the IPhone object's madeIn is CHINA
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;


    public IPhone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){  //instance method is an object member.
        System.out.println("Brand: " + brand);   //instance method accepts static method
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem(){ ///static only accepts statics. Instance methods are not accepted

        System.out.println("Operating system: " + OS);
        System.out.println("where to be produced : " + madeIn);
        System.out.println("Battery: " + hasBattery);
        System.out.println("Touch Screen: " +isTouchScreen);
        System.out.println("is expensive to fix : " + isExpensiveToFix);

    }

     }



 /*
Attributes:
brand, model,color,price, operating system (OS), memory, madeIn, hasBattery, isTouchScreen , isExpensiveToFix
  */