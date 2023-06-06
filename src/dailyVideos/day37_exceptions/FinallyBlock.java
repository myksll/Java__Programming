package dailyVideos.day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        //finally block
        try{
            System.out.println(9/0);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception has been caught");
            e.printStackTrace();
          //  System.exit(1); when we use exit method, finally will not be executed
        }finally{
            System.out.println("Finally Block");// Finally will always be executed unless  exit method  before finally
        }

















    }
}
