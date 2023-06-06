package dailyVideos.day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {


        DecimalFormat  df = new DecimalFormat("0.000");
        double n1 = 10.587654;

        System.out.println(df.format(n1));  //10,588



        DecimalFormat  dff = new DecimalFormat("0.0");
        double n2 = 10.587654;

        System.out.println(dff.format(n2));  //10,6



        DecimalFormat  dfff = new DecimalFormat("0");
        double n3 = 10.587654;

        System.out.println(dfff.format(n3));  //11 --> 10.587654 --->one will be added



    }
}
//sayilari yuvarlama. son sayi bi üst sayiya yuvarlaniyor.