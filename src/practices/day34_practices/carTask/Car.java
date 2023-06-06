package practices.day34_practices.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;


    //constructor
    public Car(String make, String model, int year, double price, String color) {

        if(make == null || make.isEmpty()){
            System.err.println("Make can not be empty or null");
            System.exit(1);
        }
        this.make = make;

        if(model == null || model.isEmpty()){
            System.err.println("Model can not be empty or null");
            System.exit(1);
        }
        this.model = model;

        if(year <1886){
            System.err.println("Year can not be less than 1886");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    //setter -->price , color
    public void setPrice(double price) {
        if(price<0){
            System.err.println("Price can not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            System.err.println("Color can not be empty or null");
            System.exit(1);
        }
        this.color = color;
    }


    //getter -->al of them
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


    //abstract methods

    public abstract void start();
    public abstract void drive();

    //none abstract methods

    public void stop(){
        System.out.println(make+ " "+ model+" is stopping");
    }

    //toString


    @Override
    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
