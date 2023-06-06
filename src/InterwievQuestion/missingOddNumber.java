package InterwievQuestion;

public class missingOddNumber {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 11};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }


        int expectedSum= (arr.length+1) * (arr[0]+ arr[arr.length-1])/2;
        int missingNum= expectedSum-sum;

        System.out.println("Missing Number: "+missingNum);









    }



}


/*
    Scanner scan = new Scanner(System.in);

        System.out.println("Enter the positive odd numbers from 1 to 100");   //1,3,5,7,9,13,15,17

                int posOddNum=scan.nextInt();


                for (int i = 1; posOddNum<100; i++) {

        if(posOddNum%2==1){
        System.out.println(posOddNum);
        }

 */