package practices.day04_practices;

public class SalaryCalculator {
    public static void main(String[] args) {

        String name="Joshua";

        int hourlyRate= 40,
                weeklyHours=45;
             int salary;

             salary= hourlyRate* weeklyHours*52;

        System.out.println("Hello "+ name+", your salary"+ " is $ "+ salary );




    }
}
