package dailyVideos.day22_ArrayList;

public class MaxMinArray {
    public static void main(String[] args) {


//index  elements:         0   1  2
      int [][] array = { {100,20,300}, {10,1000,50}, {-200,400,0} };
//index number of array:       0             1               2

//Muhtar´s solution

          int max=array[0][0];
          int min=array[0][0];

          for( int[] each1D : array){

              for (int eachElement : each1D) {

                  if( eachElement > max){
                      max=eachElement;
                  }

                  if( eachElement < min ){
                      min=eachElement;
                  }
              }

          }


        System.out.println("max = " + max);
        System.out.println("min = " + min);


/* my solution

        int max=0;
        int min=0;

        for (int i = 0; i < array.length; i++) {
            int[] array1D=array[i];
            for (int j = 0; j < array1D.length; j++) {
                int eachElement=array1D[j];
                //System.out.print(eachElement+"\t");

                if(eachElement>max){
                    max=eachElement;
                }

                if(eachElement<min){
                    min=eachElement;
                }
            }
        }

        System.out.println(max);
        System.out.println(min);
 */
    }
}
/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000

 */

