package practices.day30_practices.cyrptoTask;

public class Bitcoin extends CryptoToken{

    public Bitcoin(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMinable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMinable);
    }
}
