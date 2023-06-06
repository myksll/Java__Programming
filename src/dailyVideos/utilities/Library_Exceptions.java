package dailyVideos.utilities;

public class Library_Exceptions {
/*
    public static void  sleep(double seconds) throws  InterruptedException{ //the cheapest way

        Thread.sleep((long)(seconds * 1000L)); //   Thread.sleep expects long method but meets double, so exceptions comes
}

 */

    public static void  sleep(double seconds){

         try{
             Thread.sleep((long)(seconds * 1000L));
         }catch(InterruptedException e){
             throw new RuntimeException(e); //permanently
         }











    }








}
