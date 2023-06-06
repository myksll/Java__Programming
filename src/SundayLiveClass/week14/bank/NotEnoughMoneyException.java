package SundayLiveClass.week14.bank;

public class NotEnoughMoneyException extends RuntimeException {


    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
