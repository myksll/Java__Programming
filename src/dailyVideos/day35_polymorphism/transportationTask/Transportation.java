package dailyVideos.day35_polymorphism.transportationTask;

public abstract class Transportation{

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    //constructor
    public Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);

    }

    //getter-->both of them
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getyear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //setter--> only color and price, the other are final. Final can not have set method

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //abstract method ->the situation can change in the transportation subclass
    public abstract void transportPeople();
    public abstract void start();

    //instance method
    public void stop(){  //all the transportation is the situation same.
        System.out.println("Shut off the engine ");
    }

    //toString


    @Override
    public String toString() {
        return  getClass().getSimpleName()+ "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
