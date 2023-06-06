package dailyVideos.day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractices {
    public static void main(String[] args) {


        //odd numbers

        int[] numbers ={1,2,3,4,5,6,7,8,9,10,11};

        for (int each : numbers) {
          //  System.out.println(each); //1,2,3,4,5,6,7,8,9,10,11

            if(each % 2 != 0){
                System.out.println(each);
            }
        }

        System.out.println("----------------------------------------------------------------");

        //maximum~minimum numbers ---> sortOf method is not allowed in interview

        int[] nums={10,20,30,40,50,60,7988,1,10000};

        int max= nums[0];
        int min =nums[0];

        for (int each : nums) {

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println(max);//10000
        System.out.println(min); //1

        System.out.println("----------------------------------------------------------------");

        //merge to arrays .....> [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100};

        int[] a3 = new int[a1.length + a2.length];

        int k =0;

        for (int each : a1) {
           // System.out.println(each);
            a3[k++] = each;
        }

        for (int each : a2) {
            a3[k++]=each;
        }

        System.out.println(Arrays.toString(a3));   //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        System.out.println("----------------------------------------------------------------");

        // initialize of the name---->Merve Karaca --->M.K

         String [] name ={"Muhammed Karimi", "Vasyl Dobriaks", "Gadir Ibrahimov"};

        for (String each : name) {
            System.out.println( each.charAt(0)+ "."+each.charAt(each.lastIndexOf(" ") +1) );
        }

        System.out.println("----------------------------------------------------------------");











    }
}
