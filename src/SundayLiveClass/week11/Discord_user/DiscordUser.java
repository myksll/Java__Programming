package SundayLiveClass.week11.Discord_user;

import java.time.LocalDate;

public class DiscordUser {

    private String role, name ,id;

    private LocalDate accountCreationDate;

    //constructor
    public DiscordUser(String role, String name, String id, LocalDate accountCreationDate) {
        setRole(role);
        setName(name);
        setId(id);
        setAccountCreationDate(accountCreationDate);
    }

    //setter getter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public void sendMessage(){
        System.out.println("Sending the message to the class chat");
    }

    public String joinDiscord(String discordUrl) {  //void is also possible
        return "Sending " + getId();
    }

    public static void launch(){  // static methods can not be inherited
        System.out.println("Connecting to server");
    }

    @Override
    public String toString() {
      /*  return   getClass().getSimpleName()+"{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                '}';

       */


       return name+" # " + id+ "\nRoles: "+ role +"\nAccount Created: " + accountCreationDate;
    }
}
