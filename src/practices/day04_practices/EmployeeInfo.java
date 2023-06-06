package practices.day04_practices;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name= "Daniel",
                gender="Male",
                company_name= "Google Inc",
                jobTitle= "Software Developer";

        int age=28,
            salary=90000;

        System.out.println(name+" is "+age+" years old , gender is "+ gender+".");
        System.out.println(name+" works at "+company_name+ " as a "+jobTitle+".");
        System.out.println(name+" makes $"+salary+ " per year.");

    }
}
