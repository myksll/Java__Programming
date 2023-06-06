package practices.day12_practices;

public class capitalization {
    public static void main(String[] args) {
        capitalization("meRve","kArAca");

    }



    public static void capitalization(String firstName,String lastName){

       firstName = firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1);
       lastName = lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);

        String fullName=firstName+" "+lastName;

        System.out.println(fullName);


    }


}
/*

2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */