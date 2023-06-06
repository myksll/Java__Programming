package SundayLiveClass.week4;

import javax.management.MBeanAttributeInfo;

public class MK {

    public static void main(String[] args) {


     /*   String name= "     CHUCK mORRIS   ";

        int spaceIndex = name.indexOf(" ");
        String lastChar=  name.substring(spaceIndex+1);

        System.out.println(lastChar);
*/
String name= "    CHUCK NORRIS  ";
        name = name.toUpperCase();
        name = name.trim().substring(0,1)+ "."+ name.charAt(name.indexOf("") + 1) + ".";
        System.out.println(name);

        name = name.trim().toUpperCase();
        name = name.charAt(0) + "." + name.charAt(name.indexOf(' ') + 1) + ".";

        System.out.println(name);

        String lastName =""+ name.charAt(name.indexOf(' ')+ 1);

        name = name.trim().substring(0,1)+ "."+ lastName.substring(0,1).toUpperCase();
        System.out.println(name);


        name=name.replace(" ","").toUpperCase();
        name=name.charAt(0)+"."+name.charAt(name.indexOf(' ')+ 1);
        System.out.println(name);
    }
}
