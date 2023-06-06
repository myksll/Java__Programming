package dailyVideos.day22_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

         //ArrayList Methods

        //add()

        ArrayList<Integer> list = new ArrayList<>(); //Integer
        System.out.println(list);//[]-->it is empty now

        list.add(10);    //add method returns Primitive to Integer from wrapper class
        System.out.println(list); //[10]

        list.add(20);
        list.add(30);
        System.out.println(list); //[10, 20, 30] -->we can add element how many we want

        list.add(0,50); //we write index of ArrayList and number
        System.out.println(list); //[50, 10, 20, 30]

        list.add(2,96);
        System.out.println(list); //[50, 10, 96, 20, 30]


        ArrayList<Double> list2 = new ArrayList<>();  //Double
        list2.add(5.5);
        System.out.println(list2);//[5.5]

        System.out.println("-----------------------------------------------------------------------------");

        //get() ---> returns element of the Array. --->we write index number in curly braces.
        // we can find first element by using get(0) method
        //   "   "   "  last  "      "    "    get()   "

        ArrayList<String> studentsList =new ArrayList<>();
        studentsList.add("Mohammed");
        studentsList.add("Abdurasul");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size()); //3
        System.out.println(studentsList);//[Mohammed, Abdurasul, Tatiana]

        String firstStudent= studentsList.get(0);   //first index number
        System.out.println(firstStudent); //Mohammed

        String lastStudent= studentsList.get(studentsList.size()-1);  //last index number
        System.out.println(lastStudent); //Tatiana

        System.out.println("-----------------------------------------------------------------------------");



    }
}

