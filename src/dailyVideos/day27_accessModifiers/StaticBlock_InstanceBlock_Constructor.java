package dailyVideos.day27_accessModifiers;

public class StaticBlock_InstanceBlock_Constructor {

    public StaticBlock_InstanceBlock_Constructor(){ //constructor --> it takes arguments. They can not be  executed , because they want a seperate object.  -->new StaticBlock_InstanceBlock_Constructor(); in main method
        System.out.println("Constructor");
    }

    {   //instance block --> They do not take any argument . According to object, it can be executed-->They can not be  executed , because they want a seperate object.  -->new StaticBlock_InstanceBlock_Constructor(); in main method
        System.out.println("Instance block");
    }

    static{  //static block--> They do not take any argument . it can not be executed more than once. it does not depend on the objects
        System.out.println("Static Block");
    }


    public static void main(String[] args) {

       System.out.println("Main method");    //at first Static Block ,then main Method are executed-->Static Block Main method

        new StaticBlock_InstanceBlock_Constructor();  //Instance block Constructor
        new StaticBlock_InstanceBlock_Constructor();  //Instance block Constructor
    }
}
/*
output: the EXECUTION FLOW:
        Static Block -> #1 static block [regardless of main, static block get executed FIRST and only ONCE]

        Main Method -> #2 main method [basic java execution flow-top to bottom and left to right]

        Instance Block -> #3 instance block [3&4 comes with Constructor(create obj.)- first instance block then constructor]
        Constructor -> #4 Constructor

        Instance Block -> #5 Instance Block [5&6 comes with Constructor(create obj.)- first instance block then constructor]
        Constructor ->  #6 Constructor

        Main method -> #5 main method [basic java execution flow-top to bottom and left to right]
         */
