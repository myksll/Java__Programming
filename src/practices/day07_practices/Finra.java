package practices.day07_practices;

public class Finra {         //interview question!!!!!!!!!!!!

    public static void main(String[] args) {


          int num=7;

          if(num%3==0 ||num%5==0 || num%15==0) {
              if (num % 3 == 0 && num%5!=0) {
                  System.out.println("FIN");
              } else if (num % 5 == 0 && num%3!=0) {
                  System.out.println("RA");
              } else {
                  System.out.println("FINRA");
              }
          }else{
              System.out.println(num);
          }

    }


}
