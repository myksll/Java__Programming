package dailyVideos.day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a; // static members
    public static double b;
    public static String c ;

    // public static ExcelSheet sheet;---> we can not directly assign sheet to this variable in the Java.We need to static block to set this

    static{ // static block->gets executed automatically.When StaticInitializationBlock class is called,static block gets executed automatically-->static block-->the best choice to initialize static members
        a=100;
        b=20.5;
        c="Java";
    }

     /* ---> main method will be not executed in the other class
        we can not call main method. output will be: a=0  b=0.0 c=null
    public static void main(String[] args) {
        a=100;
        b=20.5;
        c="Java";
    }
     */


    /*--->  what if I use Constructor?---> output will be: a=0  b=0.0 c=null.Constructor only will be executed, when we create the object ---> new StaticInitializationBlock();-->but it is not the best choice. so static should be never initialized within the Constructor

    public StaticInitializationBlock(){
        a=100;
        b=20.5;
        c="Java";
    }
     */
}
