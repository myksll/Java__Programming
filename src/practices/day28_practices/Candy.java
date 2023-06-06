package practices.day28_practices;

public class Candy {


    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;


    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    //setters getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {


        this.price = price;
    }

    public int getQuantity() {

        if(price==0){
            System.out.println("free");
            System.exit(1);
        }
         return quantity;
    }

    public void setQuantity(int quantity) {

        if(quantity<=0){
            System.err.println("invalid quantity: "+ quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }
    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public double calcCost(){
        return  quantity * price;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", unit price=" +((price==0) ? "Free" : price)  +
                ", total price=" +((calcCost()==0) ? "Free" : "" +calcCost())  +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
