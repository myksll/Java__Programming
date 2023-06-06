package practices.day07_practices;

public class GradeLevel {
    public static void main(String[] args) {


        byte num=9;

        String result="Invalid grade level given";

        if(num>=1 && num<=18){

            if(num>=17 ){
                result="Grad School";
            } else if(num>=13 ){
                result="College";
            }else if(num>=9 ){
                result="High school";
            }else if(num>=6){
                result="Middle school";
            }else{
                result="Elementary School";
            }

        }


        System.out.println(result);

    }
}
