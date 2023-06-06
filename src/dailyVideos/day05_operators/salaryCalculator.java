package dailyVideos.day05_operators;

public class salaryCalculator {

    public static void main(String[] args) {

        double hourlyRate= 50,
                weeklyHours= 45,
                stateTaxRate=6,  //implicit Casting
                federalTaxRate=26;

        //.............................

        double salaryBeforeTax= hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax= salaryBeforeTax* federalTaxRate/100;
        double totalTax= stateTax+ federalTax;
        double salaryAfterTax= salaryBeforeTax - totalTax;



        System.out.println("Gross pay is: $"+ salaryBeforeTax );
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Total tax is: $"+ totalTax);
        System.out.println("Net income is: $"+salaryAfterTax);

        System.out.println("-----------------------------------------------");

        System.out.println("Gross pay is: $"+ salaryBeforeTax+
                "\n"+"Federal tax is: $"+federalTax+
                "\n"+"State tax is: $"+stateTax+
                "\n"+"Total tax is: $"+ totalTax+
                "\n+"+"Net income is: $"+salaryAfterTax);














    }
}
