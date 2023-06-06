package dailyVideos.day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan= new Scanner(Path.of("src/dailyVideos/day10_string/Test.txt"));

/*
        System.out.println(scan.nextLine());   //if I want to read the first line in java, use nextLine(). //output-->Today is friday!
        System.out.println(scan.nextLine());    // second line   --->Java Programming Language
        System.out.println(scan.nextLine());     // third line   ---->Cydeo School
  */


        System.out.println(scan.next());  //first word  --->Today
        System.out.println(scan.next());  //second word  --->is
        System.out.println(scan.next());  //third word   --->friday!
        System.out.println(scan.next());  //fourth word  --->java
        System.out.println(scan.next());  //fifth word   --->programming


        scan.close();



    }
}
