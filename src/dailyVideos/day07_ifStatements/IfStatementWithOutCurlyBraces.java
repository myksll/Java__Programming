package dailyVideos.day07_ifStatements;

public class IfStatementWithOutCurlyBraces {

    public static void main(String[] args) {

        int age=32;

        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("------------------------------------------------------------------------");

        if(age>=21) System.out.println("Eligible");
         else System.out.println("Not eligible");

        System.out.println("-------------------------------------------------------------------------");

        int itemNum=1;

        if(itemNum==1){
            System.out.println("Eggs");
            System.out.println("Orange");
        }else if(itemNum==2){
            System.out.println("Apple");
            System.out.println("Cherry");
        }else{
            System.out.println("Milk");
            System.out.println("Onion");
        }



                // IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACTICE



    }
}
