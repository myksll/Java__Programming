package SundayLiveClass.week13.languageTasks;

import java.sql.SQLOutput;

public class English implements Language {


    @Override
    public void hello() {
        System.out.println("Greetings");
    }

    @Override
    public void bye() {
        System.out.println("Good Bye");
    }

}