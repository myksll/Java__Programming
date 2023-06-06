package dailyVideos.day18_garbageCollection;

public class TestBankAccount {
    public static void main(String[] args) {


        BankAccount obj1 = new BankAccount();

        obj1.setInfo("Merve",45678254);  //balance=0

        System.out.println(obj1);

        obj1.deposit(2500);
        obj1.checkBalance();   //balance=2500

        obj1.deposit((-500)); //Insufficient deposit amount
        obj1.checkBalance();


        obj1.withdraw(250);
        obj1.checkBalance();  //Your available balance is 2250.0x

        obj1.withdraw(5000); //Insufficient withdraw amount
        obj1.checkBalance();

        System.out.println("---------------------------------------------------------------");

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount();

        account1.setInfo("Sebastian", 542421425);
        account2.setInfo("Umran", 1435762435);

        account1.deposit(5000); //----> Sebastian
        account2.deposit(60000); //---> Umran

        System.out.println(account1); //BankAccount{accountHolder='Sebastian', accountNumber=542421425, balance= $5000.0}
        System.out.println(account2); //BankAccount{accountHolder='Umran', accountNumber=1435762435, balance= $0.0}

        account1.withdraw(500); //---> Sebastian
        account2.withdraw(7500); //---> Umran





    }
}
