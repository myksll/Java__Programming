package dailyVideos.day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;  //instance variables
    public int age;


    /*
    {  //instance initialization block
        name = "James";
        age=29;
    }
    */


    public static void main(String[] args) {

      /*-->james is the default name. it will be used all the objects
        InstanceInitializationBlock obj1= new InstanceInitializationBlock();
        InstanceInitializationBlock obj2= new InstanceInitializationBlock();

        System.out.println(obj1.name);
        System.out.println(obj2.name);
       */

        InstanceInitializationBlock obj1= new InstanceInitializationBlock("James",29); //within Constructors
        InstanceInitializationBlock obj2= new InstanceInitializationBlock("Aoran",28);

        System.out.println(obj1.name);//James
        System.out.println(obj2.name);//Aoran
    }

    // We can not change name or age in instance initialization block ,so using Constructor is the best choice to initialize the variables
    public InstanceInitializationBlock(String name, int age) {  //now we can change name and age
        this.name = name;
        this.age = age;
    }
}
