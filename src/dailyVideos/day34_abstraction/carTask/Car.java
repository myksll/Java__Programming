package dailyVideos.day34_abstraction.carTask;

public abstract class Car { //abstract class can not be final, because final prevents the class to be parent. to be inherited, can not be instantiated.

//abstract---> private, final, static can not be used

    private final String make, model; //make is unchangeable
    private  String color;
    private final int year;
    private double price;

    //constructor
    public Car( String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();     //to set the class name to the make of the car
        this.model = model;
        setColor(color);

        if(year < 1886){ //if we do not have set method, we can change our condition in constructor
            System.err.println("Invalid year : "+year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    //getter --->all of them
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    //setter--->final can not have set method, because set can change, final is unchangeable
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        if(price <= 0 ){  //we can not write price condition in constructor, if we write, new created price objects can not be changed according to this condition, only the first written objects will be changed
            System.err.println("Invalid price: "+ price);
            System.exit(1);
        }
        this.price = price;
    }

    //methods
    protected final void stop(){ //to make sure tat non sub classes outside the package can not be access it.
        System.out.println("Press the brake to stop "+make+" "+model);
    }

    protected abstract void start(); //to be overridden

    //toString


    @Override
    public String toString() {
        return   make+"{" + //i wrote getClass for make in constructor
                " model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
