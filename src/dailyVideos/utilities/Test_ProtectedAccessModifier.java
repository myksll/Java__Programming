package dailyVideos.utilities;

import dailyVideos.day31__inheritance.ProtectedAccessModifier;

public class Test_ProtectedAccessModifier extends ProtectedAccessModifier {

    public static void main(String[] args) {


        //from ProtectedAccessModifier package(outside package) , it is not accessible, visible before extending

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();









    }

}
