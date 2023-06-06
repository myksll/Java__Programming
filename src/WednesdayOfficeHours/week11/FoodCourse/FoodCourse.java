package WednesdayOfficeHours.week11.FoodCourse;

public class FoodCourse {

    private String name;
    private double price;


    //setInfo
    public void  setInfo(String name, double price) {
        setName(name);
        setPrice(price);
    }

    //-----------------------
    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString
    public String toString() {
        return "FoodCourse{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
