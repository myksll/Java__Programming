package SundayLiveClass.week11.Discord_user;

import java.time.LocalDate;

public class Student extends DiscordUser{

    int loveForJava;

    public Student( String name, String id, LocalDate accountCreationDate,int loveForJava) {
        super("Student", name, id, accountCreationDate); //from parent class
        this.loveForJava=loveForJava;  //current class
    }


    public void sendMessage(String name) {  //overloading
        System.out.println("Sending message "+name);
    }

    @Override
    public void sendMessage() {   //overriding
        System.out.println("Sending message");
    }


    public static void launch(){ //static methods can not be inherited
        System.out.println(" Connecting to server");
    }
    //nor overriding, we hide the original by creating new one


}
