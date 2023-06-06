package dailyVideos.day14_forLoop;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {     //the real main method---> Green button shows also

        System.out.println("A");
        main(25);   //B
        main(25.5); //C
        main(true); //D

    }

    public static void main(int args) {

        System.out.println("B");

    }

    public static void main(double args) {

        System.out.println("C");
    }

    public static void main(boolean args) {

        System.out.println("D");
    }

}
