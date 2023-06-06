package dailyVideos.day27_accessModifiers;

public class InstanceBlock {



      // {} instance block
    {
        System.out.println("Instance Block");
    }


    public InstanceBlock(){ //default constructor
        System.out.println("Constructor");
    }


    public static void main(String[] args) {

        new InstanceBlock(); //Instance Block and Constructor will be executed 4 times
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
    }


}
