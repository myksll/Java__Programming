package dailyVideos.day27_accessModifiers;

public class TestStaticInitializationBlock {
    public static void main(String[] args) {


        System.out.println(StaticInitializationBlock.a);//100  they will be executed just once because of static block
        System.out.println(StaticInitializationBlock.b);//20.5
        System.out.println(StaticInitializationBlock.c);//Java

        System.out.println("----------------------------------------------------------");

        //public, protected and default : is visible in same package

        System.out.println(AccessModifiers.publicDate);

        System.out.println(AccessModifiers.protectedData);

        System.out.println(AccessModifiers.defaultData);

        //System.out.println(AccessModifiers.privateData); //it is never  accessible in same package

        new AccessModifiers();





    }
}
