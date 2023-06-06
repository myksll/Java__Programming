package dailyVideos.day19_array;

 import java.util.Arrays;
public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85; //it is not available to give another number( ,58 )
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

System.out.println("-----------------------------------------------");

        //  index numbers: 0 ~ 4
        int[] scores = new int[5]; // there are 5 elements in array. minimum size is 0 in array.


        scores[2]=78;
        scores[0]=85;
        scores[1]=75;
        scores[3]=88;
        scores[4]=95;

         //scores[-1] = 65; both of them are not possible. Array should be between 0~4
        // scores[5]=55; // index number does not exist in array. you can not decrease and increase index number in array --->Index 5 out of bounds for length 5

        // index : 0 ~ 9
       //  scores = new int[10]; // index is changed. ---> new int[5] object of array is eligible for garbage collection


        System.out.println(  Arrays.toString(scores )); //  [85, 75, 78, 88, 95]

        System.out.println(scores[2]); //--->78----> how can I access score 78? (scores[2] index:2)

System.out.println("-------------------------------------------------------------------------------------------");

      //  for (int i = 0; i < 5; i++) { // i = index number of scores array
      //      System.out.println(scores[i]);   }// all defined numbers(5) will be executed [85, 75, 78, 88, 95] but back to back.




        for (int i = 0; i < scores.length; i++) {
            // scores.length-> it is going to return you total number of the elements that are contain in this array

            System.out.println(scores[i]);   // all defined numbers(5) will be executed [85, 75, 78, 88, 95] but back to back.


         // important!!!   System.out.println(scores[scores.length-1]); //last index number:(scores[scores.length-1])










        }
    }





}
