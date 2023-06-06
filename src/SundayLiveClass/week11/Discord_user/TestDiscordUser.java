package SundayLiveClass.week11.Discord_user;

import java.time.LocalDate;

public class TestDiscordUser {
    public static void main(String[] args) {


        Student student =new Student("Muhtar","A45", LocalDate.of(2023,1,30),10);

        System.out.println(student);

        student.sendMessage();


        Admin admin =new Admin("Muhtariye", "B45",LocalDate.of(2022,3,4));
        System.out.println(admin);

        admin.createChannel();
        admin.sendMessage();

        student.sendMessage("Anna"); //overloading
        student.sendMessage(); //overriding
        Student.launch(); //hiding, not overriding


    }
}
