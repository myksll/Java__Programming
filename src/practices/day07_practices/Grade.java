package practices.day07_practices;

public class Grade {
    public static void main(String[] args) {


        char grade='M';

        String result="invalid";

        if((grade>='A' && grade<='D')|| grade=='F' ){

            if(grade=='A'){
                result="excellent";
            }else if (grade=='B'){
                result="great job";
            }else if (grade=='C'){
                result="good";
            }else if (grade=='D'){
                result="passed";
            }else{
                result="failed";
            }
        }

        System.out.println(result);

    }
}
