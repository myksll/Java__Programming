package dailyVideos.day18_garbageCollection;


import dailyVideos.day17_customClass.Dog;

public class GarbageCollection {

    public static <Dog> void main(String[] args) {

        // all those steps are done implicitly , automatically.
       //  new GarbageCollection().finalize();

        String s1 = "Java";
        s1=null; // "Java" will be eligible for garbage collection --->it does not reference any object

        System.out.println(s1); //null ---> no memory, no object

     // System.out.println(s1.toUpperCase());// there is no object that will be created.//Exception in thread "main" java.lang.NullPointerException

     // System.out.println(s1.replace(null, "Python"));//Exception in thread "main" java.lang.NullPointerException

     // empty String - null Keyword difference

        String a = ""; // this is an object
        String b = null;  // not an object

        System.out.println("----------------------------------------------------------------------------");

    }
}
