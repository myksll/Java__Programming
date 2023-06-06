package dailyVideos.day07_ifStatements;

public class LoanApplication {
    public static void main(String[] args) {

/*
1. solution
               int salary=49000;
               int creditScore=600;


               if(salary>=45000 && creditScore>=700){

                   System.out.println("You are eligible to apply for a loan");
               }else {

                   System.out.println("You are not eligible");
               }
 */

//2.solution

        int salary=49000;
        int creditScore=600;

        String result=" ";

        if(salary>=45000 && creditScore>=700){

            result="You are eligible to apply for a loan";
        }else {

            result ="You are not eligible to apply for a loan";
        }

        System.out.println(result);
    }
}
