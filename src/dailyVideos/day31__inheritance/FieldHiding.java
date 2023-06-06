package dailyVideos.day31__inheritance;

import java.security.PublicKey;

class A{

    public int a =100;
}

public class FieldHiding extends A{

    public int a = 300;

    public static void main(String[] args) {

        System.out.println(new FieldHiding().a);//you can only call instance variable ( public int a) through the object   // output is 300, because now (public int a=100 ) is hidden.



    }
}
