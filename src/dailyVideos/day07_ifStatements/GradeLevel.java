package dailyVideos.day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel=11;  //1~18

        String result="";

        if(gradeLevel<=5){                                   //false gradeLevel>=6,
            result="Elementary school";
        } else if(gradeLevel<=8){                            // false gradeLevel>=9,
            result="Middle school";
        } else if(gradeLevel<=12){                          // false gradeLevel>=13,
            result="High school";
        }else if(gradeLevel<=16){                            // false gradeLevel>=17,
            result="College";
        }else{
            result="Grad school";
        }

        System.out.println(result);






    }
}
