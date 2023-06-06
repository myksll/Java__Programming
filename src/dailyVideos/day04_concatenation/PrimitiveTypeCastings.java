package dailyVideos.day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

// implicit casting...........

       byte a= 15;
       short b= a;

       // short b= (short)a  we do not need to write ( short) .
        System.out.println(b);

        int c =a;  //implicit casting

        long d = 3000l;

        float f=d;  //implicit casting

// explicit casting.............................

        int x =100;
        byte y= (byte) x; // we have to write (byte) before x.


        float z= 20.8f;
        short q= (short)z;      // z=20.8 but q=20
        System.out.println(q);


        double n1=2.5;
        byte n2= (byte) n1; // n1=2.5  n2=
        System.out.println(n2);


        int num=500;
        byte result= (byte)num;  //explicit casting
        System.out.println(result);  //-12


        int r=50000;
        short t= (short)r;
        System.out.println(t);

        System.out.println("..................................");

        double u=3000.5;
        int p= (int)u;// explicit
        System.out.println(p);


       int o= 100;
       double d1= o;   //implicit
        System.out.println(d1);














    }
}
