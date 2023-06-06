package SundayLiveClass.week15;

import java.util.*;

public class StackAndQueue {


    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("hello");
        stack.push("hello");
        stack.push("java");
        stack.push("selenium");

        System.out.println(stack);//[hello, hello, java, selenium]

        System.out.println("peek: " + stack.peek());//selenium last in first out

        System.out.println("pop: " + stack.pop());//selenium
        System.out.println(stack);//[hello, hello, java]

        System.out.println("peek after the first pop: " + stack.peek());//java

        stack.add("zebra");
        System.out.println(stack.peek());//zebra the last added will be first out

        System.out.println("------------------------------------------------");

        Queue<String> queue1 = new PriorityQueue(); //random
        queue1.offer("james");
        queue1.offer("ana");
        queue1.offer("asia");
        queue1.offer("james");

        System.out.println(queue1);//[ana, james, asia, james]
        System.out.println(queue1.peek());  //ana   ~ element()

        System.out.println("----------------------------------------");

        Queue<String> queue2 = new ArrayDeque<>(); //insertion order
        queue2.offer("james");
        queue2.offer("ana");
        queue2.offer("asia");
        queue2.offer("james2");

        System.out.println(queue2);//[james, ana, asia, james]
        System.out.println(queue2.peek());  //james   ~ element() first in first out
        System.out.println(queue2.poll());
        System.out.println(queue2.peek());
        System.out.println("---------------------------------------------");

        Queue<String> queue3 =new LinkedList<>();//insertion order
        queue3.offer("james");
        queue3.offer("ana");
        queue3.offer("asia");
        queue3.offer("james");

        System.out.println(queue3);//[james, ana, asia, james]
        System.out.println(queue3.peek());  //james   ~ element() first in first out
        System.out.println(queue3);//[james, ana, asia, james]

        System.out.println(queue3.poll());//james
        System.out.println(queue3);//[ana, asia, james]

        System.out.println(queue3.peek());//ana

        System.out.println("---------------------------------------------");

       Deque<String> queue4 =new LinkedList<>();//insertion order
        queue4.offer("james");

        //queue4.offerFirst(); the Deque gives access in the beginning and end with methods






    }
}
