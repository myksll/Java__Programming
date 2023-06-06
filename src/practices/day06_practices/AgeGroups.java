package practices.day06_practices;

public class AgeGroups {
    public static void main(String[] args) {


        int age= 78;

        String result="";

        if (age>=1 && age<=2){
            result="infant";
        }
        if (age>=3 && age<=5){
            result="Toddler";
        }
        if (age>=6 && age<=9){
            result="Kid";
        }
        if (age>=10 && age<=12){
            result="Pre-Teen";
        }
        if (age>=13 && age<=17){
            result="Teenager";
        }
        if (age>=18 && age<=20){
            result="Young Adult";
        }
        if (age>=21 && age<=39){
            result="adult";
        }
        if (age>=40 && age<=49){
            result="young middle-ages adult";
        }
        if (age>=50 && age<=54){
            result="middle aged Adult";
        }
        if (age>=55 && age<=64){
            result="very young senior Citizen";
        }
        if (age>=65 && age<=74){
            result="young senior Citizen";
        }
        if (age>=75 && age<=84){
            result="senior citizen";
        }
        if (age>= 85){
            result="old senior citizen";
        }


        System.out.println(result);














    }
}
