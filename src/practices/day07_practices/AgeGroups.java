package practices.day07_practices;

public class AgeGroups {
    public static void main(String[] args) {

              int age=152;

              String result="invalid";

              if(age>=0 && age<=150){

                  if(age<21){
                      result="Teenager";
                  } else if(age>=21 && age<55){
                      result="Adult";
                  }else{
                      result="Senior";
                  }

              }

        System.out.println(result);


    }
}
