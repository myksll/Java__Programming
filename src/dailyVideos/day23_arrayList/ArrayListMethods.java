package dailyVideos.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        //ArrayList Methods

        //set()---> set(index number, element that I want to change)

        int[] array={1,2,3,4,5};

        array[0]=5;// we update the first Index of array by giving array[0] a value
        System.out.println(Arrays.toString(array)); //[5, 2, 3, 4, 5]

        System.out.println("----------------------------------------------------------");

        ArrayList<String>  groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");
        groceriesList.add("Water");

        System.out.println(groceriesList); //[Eggs, Paper Towels, Apples, Cooking Oil, Water]

        //if I need Apples anymore, and I want to update Apples to the other things----> I need to use set() method
        groceriesList.set(2,"Oranges");   //set() method ----> changes element
        System.out.println(groceriesList);    //[Eggs, Paper Towels, Oranges, Cooking Oil, Water]

        groceriesList.add(2,"Chicken");  //add() method--->increases the size of ArrayList
        System.out.println(groceriesList);    //[Eggs, Paper Towels, Chicken, Oranges, Cooking Oil, Water]

        System.out.println("----------------------------------------------------------");

        //remove()---> decreases the size of ArrayList--< opposite to add() method

        groceriesList.remove(5);
        System.out.println(groceriesList);//[Eggs, Paper Towels, Chicken, Oranges, Cooking Oil]--> be removed Water from groceriesList

        groceriesList.remove(1);
        System.out.println(groceriesList);//[Eggs, Chicken, Oranges, Cooking Oil]--> be removed Paper Towels from groceriesList

        groceriesList.remove("Eggs");
        System.out.println(groceriesList); //[Chicken, Oranges, Cooking Oil]--->be removed Eggs from groceriesList

        System.out.println("----------------------------------------------------------");

        //remove() --->write index number what you want to remove

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4

        // numbers.remove(1);
        boolean r1= numbers.remove(Integer.valueOf(20)); //valueOf converts primitive int to wrapper class.

        System.out.println(numbers);  //[10, 30, 40, 50]
        System.out.println(r1); //true

        //clear() -->if you remove all the elements, I mean, setting the size to zero,use clear method
        numbers.clear();
        System.out.println(numbers);//[]
        System.out.println(numbers.size()); //0

        System.out.println("----------------------------------------------------------");

        //indexOf() ~ lastIndexOf() method--->

        ArrayList<String> names=new ArrayList<>();

        names.add("Vasyl");   //0
        names.add("Vasyl");   //1
        names.add("Sumeyye"); //2
        names.add("Sumeyye"); //3
        names.add("Ali");     //4
        names.add("Sumeyye"); //5


        System.out.println(names.indexOf("Vasyl")); //there is two Vasyl. it will always specify elements from right(0) to left(lastIndexOf) , so Vasyl´index number is 0

        System.out.println(names.lastIndexOf("Vasyl")); //1, because last time the element appeared is at index 1.

        System.out.println(names.lastIndexOf("Sumeyye"));//5

        System.out.println("----------------------------------------------------------");

        //contains()---> it is useful verifying, checking if the specified array contains in the ArrayList

        boolean hasMuhtar = names.contains("Muhtar");
        System.out.println(hasMuhtar);  //false

        boolean hasAli = names.contains("Ali");
        System.out.println(hasAli);  //true

        System.out.println("----------------------------------------------------------");

        //equals() ---> 2 ArrayList will be compared-->

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2=list1;

        list1.add(10);

        System.out.println(list1); //both of them have same object
        System.out.println(list2);

        System.out.println(list1 == list2); //true

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);//[10]
        System.out.println(l2);//[]

        System.out.println(l1 == l2); //false, because they are different object in heap memory, when we use == .

        System.out.println(l1.equals(l2));//true because they are same element

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1  = " + n1 );//n1  = [10, 20, 30]
        System.out.println("n2 = " + n2); //n2 = [30, 10, 20]

        System.out.println(n1.equals(n2));//false because they are not in the same order

        System.out.println("----------------------------------------------------------");

        //isEmpty()--->checks if Arraylist has any element-->if there is an element, isEmpty method returns always False

        System.out.println(n1.isEmpty());//false
        System.out.println(n2.isEmpty());//false

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());//true
        System.out.println(n2.isEmpty());//true

        System.out.println("----------------------------------------------------------");

    }
}
