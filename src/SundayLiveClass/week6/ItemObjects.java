package SundayLiveClass.week6;

public class ItemObjects {
    public static void main(String[] args) {



        Item apples=new Item();

        apples.setInfo("apple", 5 , 2.5);
        System.out.println(apples);


        Item javaBook = new Item();
        javaBook.setInfo("Java book", 4, 150);
        System.out.println(javaBook);

        apples.sellItem(10);  //Sorry we only have 5---> ITEM: apple | 5 | $2.5
        System.out.println(apples);

        javaBook.sellItem(10);
        System.out.println(javaBook);
    }
}
