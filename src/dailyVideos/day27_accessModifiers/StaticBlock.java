package dailyVideos.day27_accessModifiers;

public class StaticBlock {


//if we print StaticBlocks more than once , at first, we will write the numbers what we want to print in main method , then we will print with Constructor

    public StaticBlock(){ //Constructor
        System.out.println("Constructor"); // StaticBlocks will be  printed 3 Times
    }

    static{ //static block : used before  java8

        System.out.println("Static Block");
        //first output will be  "static block" , second is "main method", even if static is written after main method
    }

    public static void main(String[] args) { //main method
        System.out.println("Main Method");

        new StaticBlock(); //objects --->However StaticBlocks is written 3 times,that will be printed only once in the main method .
        new StaticBlock(); //objects
        new StaticBlock(); //objects
    }




}
