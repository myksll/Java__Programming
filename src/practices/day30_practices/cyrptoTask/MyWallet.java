package practices.day30_practices.cyrptoTask;

public class MyWallet {
    public static void main(String[] args) {


        Bitcoin bitcoin = new Bitcoin(29.529, 570.74,17.963_569_152, 937.9E9,1, true);
        Ethereum ethereum = new Ethereum(2.078,  290.9E9, 26.6E9, 115.8E6,1, true);
        Cardano cardano = new Cardano(0.44,  38.1E9, 4.4E9, 31.9E9, 1,false);
        XRP xrp = new XRP(0.51, 46.8E9,73.5E9, 4.6E9,1,   false);
        Doge doge = new Doge(0.092, 130.2E9,8.2E9, 32.3E9, 1, true);

        System.out.println(bitcoin);
        System.out.println(ethereum);
        System.out.println(cardano);
        System.out.println(xrp);
        System.out.println(doge);

        double totalAsset= bitcoin.totalPrice()+ethereum.totalPrice()+cardano.totalPrice()+xrp.totalPrice()+doge.totalPrice();

        System.out.println(totalAsset);




    }
}
