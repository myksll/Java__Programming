package dailyVideos.day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        // pre increment/decrement

        int x= 10;
        System.out.println(++x);  // 11
        System.out.println(x); // x=11


        int y= 100;
        System.out.println(--y); //99
        System.out.println(y);    // y=99

        System.out.println("...........................................................");

        // post increment and decrement

        int a=50;

        System.out.println(a++); // 50 ==> it does not change immediately like pre increment/decrement. it saves the value.
        System.out.println(a); // 51
        System.out.println(a++); // 51
        System.out.println(a); // 52

       int b=25;

        System.out.println(b--);  //25
        System.out.println(b); //24

        System.out.println(".................................................................................");

        int n=30;

        int m= n++; // m=30 n=31

        System.out.println(m);
        System.out.println(n);

        System.out.println("-------------------------------------------------------");

        int o=30;
        int q= ++o;

        System.out.println("q = " + q);  // q=31 o=31
        System.out.println("o= " +o);


        System.out.println("---------------------");

        int z =60;

        int e=z--; // e=60  z=59

        System.out.println("e = " + e);
        System.out.println("z = " + z);



    }
}
