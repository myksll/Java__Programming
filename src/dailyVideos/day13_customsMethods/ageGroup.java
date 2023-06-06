package dailyVideos.day13_customsMethods;

public class ageGroup {
    public static void main(String[] args) {

          ageGroup(1500);

    }

      public static void ageGroup(int age){


        if(age>=0 && age<=150){

            System.out.println( (age<21) ? "Teenager": (age>=21 && age<55) ? " Adult" :  "Senior" );

        }else{
            System.err.println("Invalid age: "+age);

        }


      }

}
/*
2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )

 */