package dailyVideos.day40_collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6));


       /* //for each loop implicitly to iteration
        for(Integer each: list){
            if(each<5){
                list.remove(each);
            }
        }
        System.out.println(list);//ConcurrentModificationException
       */

       /*  for(int i = 0; i< list.size();i++){
            if(list.get(i) < 5){
                list.remove(i);
            }
        }
        System.out.println(list);//ConcurrentModificationException
       */


//remove elements(iterator)= while using while loop

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6));

        list2.iterator(); //how many elements we have collection

        Iterator<Integer> it = list2.iterator();

        while(it.hasNext()){   //while: asks condition only, so it is most preferred. if we used for each loop, we could not see it of Iterator in for each loop
          Integer each = it.next(); //getting element if hasNext is true
            if(each < 5){
                it.remove();
            }
        }
        System.out.println(list2);//[5, 6, 5, 6, 5, 6]


        System.out.println("--------------------------------------------------------------------------------------------------------");
//remove elements(iterator)= while using for loop

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6));

       for(Iterator<Integer> i= list3.iterator(); i.hasNext(); ){
            Integer each = i.next();
            if(each < 5){
                i.remove();
            }
        }
        System.out.println(list3);//[5, 6, 5, 6, 5, 6]

        System.out.println("--------------------------------------------------------------------------------------------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6));

        list4.removeIf(each->  each < 5 );//-> error token
        System.out.println(list4);//[5, 6, 5, 6, 5, 6]

        System.out.println("--------------------------------------------------------------------------------------------------------");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6));

        list5.removeIf(p-> p < 5);// =  list5.removeIf(each-> each < 5);
        System.out.println(list5);//[5, 6, 5, 6, 5, 6]

        System.out.println("--------------------------------------------------------------------------------------------------------");


    }
    }

