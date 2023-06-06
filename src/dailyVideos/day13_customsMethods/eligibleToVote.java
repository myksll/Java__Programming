package dailyVideos.day13_customsMethods;

public class eligibleToVote {
    public static void main(String[] args) {


        eligibleVote(230,true);

    }

    public static void eligibleVote(int age, boolean isAmerican){

        if(age>=18 && isAmerican==true && age<=150){
            System.out.println("You are eligible to vote");

        }else{
            System.err.println("You are not eligible to vote");
        }


    }

}
