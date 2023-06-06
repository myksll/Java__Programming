package dailyVideos.day07_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {


     // 1. solution      // in this situation all of if statements will be checked. right but not the best solution


        int a=100;
        String result="";

        if(a>0){
            result="Positive";
        }
         if(a<0){
            result="Negative";
        }
        if(a==0){
            result="Zero";
        }
         System.out.println(result);


//2. solution-------------------------------------------------------------------------------------------------


        String result2="";

        if(a>0){
            result2="Positive";
        }else if (a<0) {
            result2 = "Negative";
        }else{
            result2="Zero";
        }
        System.out.println(result2);
    }
}
