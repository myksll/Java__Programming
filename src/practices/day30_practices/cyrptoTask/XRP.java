package practices.day30_practices.cyrptoTask;

public class XRP extends CryptoToken{

    public XRP(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMinable) {
        super(price, quantity,marketCap, volume, circulatingSupply,  isMinable);
    }
}
