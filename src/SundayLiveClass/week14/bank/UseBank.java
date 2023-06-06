package SundayLiveClass.week14.bank;

//this class is the user ,the person who would use this bank/code
public class UseBank {
    public static void main(String[] args) {  //throws CannotBeNegativeException

        Bank bank = new Bank(1000,1325457);

        bank.withdraw(400);//has unchecked , so exception would occur during runtime

        System.out.println(bank.getBalance());


        Bank bank2 = new Bank(0,0);

        try {
            bank2.setBalance(-100);
        } catch (CannotBeNegativeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("end");

    }
}
