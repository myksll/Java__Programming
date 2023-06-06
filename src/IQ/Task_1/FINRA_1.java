package IQ.Task_1;

public class FINRA_1 {
    public static void main(String[] args) {

        int number = 15;

        if(number%15==0 ||number%5==0 ||number%3==0 ){

            if(number%15 ==0){
                System.out.println("FINRA");

                }else if(number%5==0){
                    System.out.println("RA");
                }else{
                    System.out.println("FIN");
                }

            }else{
            System.out.println(number);
        }




    }
}
