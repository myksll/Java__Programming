package practices.day25_practices;

public class SalaryCalculator {

    public double hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }
    public double federalTax() {
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax() {
        double totalTax= stateTax()+federalTax();
        return salary()-totalTax;
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary= $" + salary() +
                ", stateTax= $" + stateTax() +
                ", federalTax= $" + federalTax() +
                ", salaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
}
/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:e
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object


 double salaryBeforeTax =hourlyRate*weeklyHours*52,
                  stateTax= salaryBeforeTax*6/100,
                  federalTax=salaryBeforeTax*26/100,
                  totalTax=stateTax+federalTax,
                  netIncome=  salaryBeforeTax-totalTax;
 */