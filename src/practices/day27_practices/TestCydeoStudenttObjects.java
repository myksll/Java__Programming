package practices.day27_practices;

import java.sql.SQLOutput;

public class TestCydeoStudenttObjects {

    public static void main(String[] args) {

        CydeoStudentt student1= new CydeoStudentt("Kubra",'F',25, 25,10,"SDET");

        System.out.println(student1);

        student1.attendClass();
        student1.study();

        System.out.println(CydeoStudentt.secretCode);
        System.out.println(CydeoStudentt.programmingLanguage);


    }
}
