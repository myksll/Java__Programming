package dailyVideos.day22_ArrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

       // ArrayList by using for loop ~ for each loop
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100); //0
        numbers.add(200); //1
        numbers.add(300); //2
        numbers.add(400); //3
        numbers.add(500); //4

        numbers.add(3,32);

        System.out.println(numbers); //[100, 200, 300, 32, 400, 500]

        System.out.println("------------------------------------------------------------");

        //thanks to for loop , we can create int variable from start to end  or reverse
//1.way
        for(int i = 0; i < numbers.size();i++){
              int each = numbers.get(i);
            System.out.println(each);   //100 200 300 32 400 500  --->they are int, not Arraylist
        }

//2.way
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));  //100 200 300 32 400 500
        }

        System.out.println("------------------------------------------------------------");

//reverse of ArrayList
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i)); //500 400 32 300 200 100
        }

        System.out.println("------------------------------------------------------------");

//for each loop
        for (Integer each : numbers) {
            System.out.println(each);  ////100 200 300 32 400 500
        }






    }
}
