package practices.day30_practices.cyrptoTask;

public class CryptoToken {

    private double price, marketCap,volume,circulatingSupply;
    private int quantity;
    private boolean isMinable;


    public CryptoToken(double price, int quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setVolume(volume);
        setCirculatingSupply(circulatingSupply);
        setMinable(isMinable);
    }

    //setter getter
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price>0){
            this.price = price;
        }

    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if(marketCap>0){
            this.marketCap = marketCap;
        }

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {

        this.volume = volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
            this.quantity = quantity;
        }

    }

    public boolean isMinable() {
        return isMinable;
    }

    public void setMinable(boolean minable) {
        isMinable = minable;
    }

    public double totalPrice(){
        return price * quantity ;
    }

    public String toString() {
        return   getClass().getSimpleName() + "{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" +isMinable() +
                '}';
    }
    }

