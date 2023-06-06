package InterwievQuestion;

public class missingEvenNumber {

    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 10,12,14}; //find the missing number

        int sum=0;


        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        int expectedSum= (arr.length+1)* (arr[0]+arr[arr.length-1])/2;
        int missingNum = expectedSum-sum;
        System.out.println("Missing number: "+missingNum);




    }




}
