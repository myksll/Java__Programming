package practices.day29_practices.carTask;

public class Car {

    private String make, model;
    private  int year;
    private String color;
    private double price;


    public void setInfo(String make, String model, int year, String color, double price) {
        this.make=getClass().getSimpleName();
        setModel(model);
        setYear(year);
        setColor(color);
        setPrice(price);
    }

    //setters getters
    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=0){
            System.err.println("Year can not be zero or negative");
            System.exit(1);
        }
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println(" price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    //------------------------------------------------------------------


    public String toString() {
        return make+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
