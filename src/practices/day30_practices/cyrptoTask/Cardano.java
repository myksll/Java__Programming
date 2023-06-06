package practices.day30_practices.cyrptoTask;

public class Cardano extends CryptoToken{

    public Cardano(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMinable) {
        super(price,  quantity, marketCap,volume, circulatingSupply,  isMinable);
    }
}
