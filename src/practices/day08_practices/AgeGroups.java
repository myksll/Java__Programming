package practices.day08_practices;

public class AgeGroups {
    public static void main(String[] args) {


        int ageOfPerson=151;

        String result="invalid age";

        if(ageOfPerson>=0 && ageOfPerson<=150) {

            result = (ageOfPerson >= 85) ? "Old Senior Citizen" : (ageOfPerson >= 75) ? "Senior Citizen" : (ageOfPerson >= 65) ? "Young Senior Citizen" :
                     (ageOfPerson >= 55) ? "Very Young Senior Citizen " : (ageOfPerson >= 50) ? "Middle-Aged Adult" : (ageOfPerson >= 40) ? "Young Middle-Aged Adult" :
                     (ageOfPerson >= 21) ? "Adult" : (ageOfPerson >= 18) ? " Young Adult " : (ageOfPerson >= 13) ? "Teenager" :
                     (ageOfPerson >= 10) ? "Pre-Teen " : (ageOfPerson >= 6) ? "Kid" : (ageOfPerson >= 3) ? "Toddler" :
                                            "infant";
        }
        System.out.println(result);

    }
}
