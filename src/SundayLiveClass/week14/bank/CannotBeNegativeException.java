package SundayLiveClass.week14.bank;

public class CannotBeNegativeException extends Exception{


    public CannotBeNegativeException() {
        super("The input cannot be negative");
    }
}
