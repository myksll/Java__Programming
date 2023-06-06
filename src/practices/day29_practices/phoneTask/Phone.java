package practices.day29_practices.phoneTask;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    //setInfo
    public void SetInfo(String brand, String model, String size, double price, String color) {
        this.brand=getClass().getSimpleName();
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    //setters getters
    public String getBrand() {
        if(brand==null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand can not be empty or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        if(model==null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty() || model.isBlank()){
            System.err.println("Model can not be empty or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0){
            System.err.println("price can not be zero or negative");
        }
        this.price = price;
    }

    public String getColor() {

        if(color==null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty() || color.isBlank()){
            System.err.println("Color can not be empty or blank");
            System.exit(1);
        }
        this.color = color;
    }
//-------------------------------------------------------------------------

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
//brand, model, size, price, color