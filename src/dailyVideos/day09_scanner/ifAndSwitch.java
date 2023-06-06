package dailyVideos.day09_scanner;

public class ifAndSwitch {
    public static void main(String[] args) {

        System.out.println("--------------------------if--------------------------------------");

           int numOfPeople=5;

           String result=" ";

        if (numOfPeople==50 || numOfPeople==75 || numOfPeople==100) {

            if (numOfPeople == 50) {
                result = "20 crew , 30 passenger";
            } else if (numOfPeople == 75) {
                result = "25 crew , 50 passenger";
            } else {
                result = "30 crew , 70 passenger";
            }
        }else  {
            result="Invalid";
        }


        System.out.println(result);


        System.out.println("-----------------------if and switch--------------------------------------");


        if (numOfPeople==50 || numOfPeople==75 || numOfPeople==100) {

              switch(numOfPeople) {

                  case 50:
                      System.out.println("20 crew , 30 passenger");
                  case 75:
                      System.out.println("25 crew , 50 passenger");
                  default:
                      System.out.println("30 crew , 70 passenger");
              }

        }else{
            System.out.println ("Invalid");
        }

    }
}
