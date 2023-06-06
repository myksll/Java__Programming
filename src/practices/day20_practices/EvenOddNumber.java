package practices.day20_practices;

import java.util.Arrays;

public class EvenOddNumber {
    public static void main(String[] args) {


        int[] nums= {1,2,3,4,5,6,9,8,7};

        int odd=0;
        int even=0;

        for (int each : nums){

            if(each % 2==0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println(Arrays.toString(nums)+" has "+even+ " even numbers "+ odd+ " odd numbers");




    }
}
/*
1.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */