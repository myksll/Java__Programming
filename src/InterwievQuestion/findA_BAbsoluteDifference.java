package InterwievQuestion;

public class findA_BAbsoluteDifference {


    public static void main(String[] args) {

        String str = "AAAAAABBBBBBB";

        int countA = 0;
        int countB = 0;

        for (char character : str.toCharArray() ){
            if(character =='A'){
                countA++;
            }else{
                countB++;
            }

        }

        if(countA>countB){
  System.out.println(countA-countB);
        }

        if(countB> countA){
            System.out.println(countB-countA);
        }



    }


    }


/*
Given a String which only consists of characters 'A and 'B, find the absolute difference between their number of occurrences

input: "AAABAB"
output: 2

input: "AAAAAAAAB"
output: 7

input:"BB"
output:2

 */