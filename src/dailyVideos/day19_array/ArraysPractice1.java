package dailyVideos.day19_array;

import java.util.Arrays;

public class ArraysPractice1 {
        public static void main(String[] args) {

                String[] myGroup = new String[5];

                myGroup[0] = "Merve";
                myGroup[myGroup.length - 1] = "Jacqueline";
                myGroup[1] = "Mesut";
                myGroup[2] = "James";
                myGroup[3] = "Jack";

                System.out.println(Arrays.toString(myGroup)); //[Merve, Mesut, James, Jack, Jacqueline]

                myGroup[0] = "Feyza";

                System.out.println(Arrays.toString(myGroup)); //[Feyza, Mesut, James, Jack, Jacqueline]


                System.out.println("--------------------------------------------------------------------");

                //write to order or reverse order of array!!!!

                for (int i = myGroup.length-1 ; i >= 0; i--) { //how should I print reverse order in array?--->for loop

                       // System.out.println(i); // output--->4 3 2 1 0
                        System.out.println(myGroup[i]); // output---> Jacqueline Jack James Mesut Feyza
                }

                System.out.println("------------------------------------------------------------------------------");


                for (int i = myGroup.length - 1; i >= 0; i--) {   //shortcut----myGroup.forr  --> you can find reverse order
                        System.out.println(myGroup[i]);          // Jacqueline Jack James Mesut Feyza
                }


                for (int i = 0; i < myGroup.length; i++) {     //shortcut ---> myGroup,fori  ---> you can find order of array
                        System.out.println(myGroup[i]);       //Feyza Mesut James Jack Jacqueline
                }


        }

        }
