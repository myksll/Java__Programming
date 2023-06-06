package practices.day04_practices;

public class salaryCalculator2 {
    public static void main(String[] args) {



        double hourlyRate=50,
              weeklyHours =45;




          double salaryBeforeTax =hourlyRate*weeklyHours*52,
                  stateTax= salaryBeforeTax*6/100,
                  federalTax=salaryBeforeTax*26/100,
                  totalTax=stateTax+federalTax,
                  netIncome=  salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: "+salaryBeforeTax);
        System.out.println("Federal tax is: "+federalTax);
        System.out.println("State tax is: "+stateTax);
        System.out.println("Total Tax is: "+totalTax);
        System.out.println("Net income is: "+netIncome);




















    }
}
