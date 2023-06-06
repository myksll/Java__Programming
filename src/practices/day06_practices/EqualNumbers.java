package practices.day06_practices;

public class EqualNumbers {
    public static void main(String[] args) {

        double n1=1000,
                n2=100,
                n3=25;

        String result ="";

        if (n1 ==n2 &&  n2==n3){
            result="all equal";
        }
        if( n1==n2 && n1!=n3){
            result= "n1&n2 are equal";
        }
        if( n2==n3 && n2!=n1){
             result= "n2&n3 are equal";
         }
         if (n3==n1 && n1!=n2){
             result= "n3&n1 are equal";
         }
          if(n1!=n2 && n1!=n3&& n2!=n3){
              result= "none of them are equal";
          }

        System.out.println(result);


















    }
}
