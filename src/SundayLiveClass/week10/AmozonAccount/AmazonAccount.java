package SundayLiveClass.week10.AmozonAccount;

public class AmazonAccount {

   private String userName;
   private String email;
   private boolean hasPrime;

    public AmazonAccount(String userName, String email, boolean hasPrime) {
        setUserName(userName);
        setEmail(email);
        setHasPrime(hasPrime);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }


    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }
}
