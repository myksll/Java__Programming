package practices.day06_practices;

public class NetIncomeCalc {
    public static void main(String[] args) {

        double salary= 100000;
        boolean isMarried= true;

        double taxRate= 0;


        if(salary>=130_000){
            taxRate = 0.35;
        }
        if(salary>=100_000 && salary<130_000){
            taxRate = 0.30;
        }
        if(salary>=80_000 && salary<100_000){
            taxRate = 0.25;
        }
        if(salary<80_000){
            taxRate = 0.20;
        }
        if(isMarried){
            taxRate -= 0.05;
        }

        double totalTax= salary*taxRate;
        double salaryAfterTax= salary - totalTax;  // double inCome= salary*(1-taxRate);

        System.out.println("Salary: "+salary);
        System.out.println("TotalTax = " +totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
