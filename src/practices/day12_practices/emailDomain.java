package practices.day12_practices;

public class emailDomain {

    public static void main(String[] args) {

        emailDomain("merve@gmail.com");


    }

    public static void emailDomain(String email){

        String domain= email.substring(email.indexOf('@')+1,email.indexOf('.'));

        System.out.println("domain: "+domain);



    }
}
/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

 */