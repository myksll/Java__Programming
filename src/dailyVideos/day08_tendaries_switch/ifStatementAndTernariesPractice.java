package dailyVideos.day08_tendaries_switch;

public class ifStatementAndTernariesPractice {
    public static void main(String[] args) {

        int score=900;

        String result="";

        if(score>=0 && score<=100){


            result=(score>=90) ? "A" :( score>=80) ? "B":(score>=70) ?"C" :(score>=60) ?"D" : "F";

        }else{
            result="Invalid Score";
        }

        System.out.println(result);

// that is better
// if you want to write all of them with Ternary, it will be unreadable. Now (nested if + ternary). it is understandable.

 System.out.println("-------------------------------------------------------------------------------------");


        String result2=(score>=0 && score<=100)?
                           (score>=90) ? "A" :( score>=80) ? "B":(score>=70) ?"C" :(score>=60) ?"D" : "F"
                        :"Invalid Score";

        System.out.println(result2);











    }
}
/*
        int score=80;  //0 ~ 100
        String result="Your grade is: ";

        if(score>=90){
            result+="A";
        } else if(score>=80 ){
            result+="B";
        } else if(score>=70){
            result+="C";
        }else if(score>=60 ){
            result+="D";
        }else{
            result+="F";
        }

        System.out.println(result);
 */