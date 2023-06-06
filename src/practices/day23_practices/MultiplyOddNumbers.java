package practices.day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {


        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,9,8,7,10));


//my solution-->int value
        for( Integer each : list){

            int m = each;
            if(each%2 != 0){
               m = each*2;
            }
             System.out.print(m + " "); //2 2 6 4 10 6 18 8 14 10
            //System.out.print(Arrays.asList(m)); //[2][2][6][4][10][6][18][8][14][10]

         }
        System.out.println();

        System.out.println("-----------------------------------------------------------------------------------------");


//muhtar´s solution--->array value

          for(int i = 0 ; i < list.size(); i++){

              if(list.get(i) % 2 != 0){
                  list.set(i, list.get(i) *2 );
              }
          }

        System.out.println(list);
    }
}
/*
6. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */