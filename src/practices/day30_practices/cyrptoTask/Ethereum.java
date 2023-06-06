package practices.day30_practices.cyrptoTask;

public class Ethereum extends CryptoToken{


    public Ethereum(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMinable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMinable);
    }
}
