package dailyVideos.day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyboard2 {

    public static void main(String[] args) throws InterruptedException,FileNotFoundException {

        //method1();
        method2();

    }

    public static void pauseFor5Seconds() throws InterruptedException{ //throws disadvantage:temporary -->  I have to use always throws with Thread.sleep(), that's why also I have to use throws on method1()

        Thread.sleep(5000);

    }

    public static void method1() throws InterruptedException{

        System.out.println("Hello World");

        pauseFor5Seconds();

        System.out.println("Hello Cydeo");
    }

    public static void method2() throws  InterruptedException, FileNotFoundException { //throws  Exception -->much shorter, readable, clean be handled

        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream("");

        Thread.sleep(5000);


    }









}
