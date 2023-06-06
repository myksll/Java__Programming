package SundayLiveClass.week10.BestBuy;

public class BestBuy {


    public String address;
    public double grossIncome;
    public double expenses;

    public static String ceo;
    public static String hq;
    public static double revenue;


    public BestBuy(String address, double grossIncome, double expenses) {
        this.address = address;
        this.grossIncome = grossIncome;
        this.expenses = expenses;
    }

    static{
        ceo= "Corie Barry";
        hq=" Richfield, Minnesota";
        revenue= 51.76;
    }
    public void reportProfits() {

       revenue += grossIncome-expenses;
    }


    public String toString() {
        return "BestBuy{" +
                "address='" + address + '\'' +
                ", grossIncome=" + grossIncome +
                ", expenses=" + expenses +
                '}';
    }
}
