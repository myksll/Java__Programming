package dailyVideos.day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); //Array Based Class ---> ge() is faster
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(100);

        arrayList.remove(0);

        arrayList.get(0);  //get method comes from link interface, we can prove it; if we delete Array and Link of List , it will still run

        System.out.println(arrayList);


        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class --> (doubly linked list)node: it has pointer to the next , and previous pointer---< add() , adAll() , remove(), removeAll(), removeIf(),
        linkedList.add(100);
        linkedList.add(100);
        linkedList.add(100);

        linkedList.remove(0);

         linkedList.get(0);

        System.out.println(linkedList);


           /*
            //parent to child interface-->polymorphism
            List<Integer> arrayList2 = new ArrayList<>();
            arrayList2.get(0);  //get method comes from link interface, we can prove it; if we delete Array and Link of List , it will still run

            List<Integer> linkedList2 = new LinkedList<>();
            linkedList.get(0);
            */

        System.out.println("------------------------------------------------------------------");

        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(100);
        vector.add(100);

        vector.get(0);
        System.out.println(vector);

        System.out.println("------------------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        //stack.remove(0);

        //stack.get(0);

        int lastElement =   stack.pop();  //there is a unique order in stack-->  last in, first  out order

        System.out.println(stack);
        System.out.println(lastElement);

        int secondLastElement2 = stack.pop();

        System.out.println(stack);
        System.out.println(secondLastElement2);
    }
}
