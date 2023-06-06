package practices.day06_practices;

public class OxygenTank {
    public static void main(String[] args) {


        int oxygenLevel=86;

        String result="";

        if (oxygenLevel>=90){
            result="Your tank is full";
        }

        if (oxygenLevel<90 && oxygenLevel>=80){
            result="Still okay";
        }

        if ( oxygenLevel<80 && oxygenLevel>=70){
            result="Don't go too far";
        }

        if (oxygenLevel<70 && oxygenLevel>=60){
            result="Start to head back";
        }


        if (oxygenLevel<60 && oxygenLevel>=50){
            result="Be careful now you at at 50%";
        }


        System.out.println(result);


















    }
}
