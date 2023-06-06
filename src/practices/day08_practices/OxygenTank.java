package practices.day08_practices;

public class OxygenTank {
    public static void main(String[] args) {

          int oxygenLevel=150;

          String result="invalid ";

          if(oxygenLevel>=50 && oxygenLevel<=100){

              result=(oxygenLevel>=90) ? "Your tank is full" :(oxygenLevel>=80)? "Still okay"
                    :(oxygenLevel>=70) ? "Don't go too far" :(oxygenLevel>=60) ? "Start to head back"
                    : "Be careful now you at  50%";
          }


        System.out.println(result);
    }
}
