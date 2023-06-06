package dailyVideos.day22_ArrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        //Autoboxing

        String str="JAava";

        int a =10;
        Integer a2=10;

        System.out.println("----------------------------------");

        int b1= 100;
        double c1=b1;    // implicitly casting
        long c2 = b1;   // implicitly casting

        Integer b2 = b1;  // primitives-->Wrapper class== Auto Boxing
        Double d1= c1;   // primitives-->Wrapper class== Auto Boxing
        Long d2 = c2;   // primitives-->Wrapper class== Auto Boxing
// Long b3=b1; -->that gives compile error.Auto boxing should be with right primitive Type.Long is not dedicated class of this int primitive

        char ch = 'A';
        Character ch1 =ch;   // primitives-->Wrapper class== Auto Boxing

        double e1=5.5;
        Double e2=e1;        // primitives-->Wrapper class== Auto Boxing

        System.out.println("----------------------------------");

        //Unboxing

        Integer n1=20; //int can assign--> int , long , double, float

        int n2 = n1;  // unboxing

        long n3 = n1;
        double n4=n1;
        float n5=n1;

        // byte n6=n1; and  short n7=n1; gives compiler error

        Character l1= 'Z'; //unboxing
        char l2 =l1;  // value is character

        int u1= l2;   // char´s value is number
        long e4=u1;


    }

}
