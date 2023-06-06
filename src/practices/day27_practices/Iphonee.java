package practices.day27_practices;

public class Iphonee {

    //static

    public static String brand;
    public static String OS;
    public static boolean isSmartPhone;
    public static String designIn;

    //instance
    public String model;
    public char size;
    public String color;
    public double price;

    public Iphonee(String model, char size, String color, double price) { //instance
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        brand="IPhone";
        OS="iOS";
        isSmartPhone=true;
        designIn="USA";
    }


    public static void printOperatingSystem(){
        System.out.println("Operating system is: " +OS);
    }

    public void call(long phoneNumber){
        System.out.println("Call: "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Text: "+phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Face Time: "+phoneNumber);
    }


    public void faceTime(String email){
        System.out.println("Face Time: "+email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}


