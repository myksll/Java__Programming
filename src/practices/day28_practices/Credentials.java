package practices.day28_practices;

public class Credentials {

    private String userName,password ;


    public Credentials(String userName, String password) {
        setUserName(userName);
         setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassword(password)){
            System.err.println("Password \""+ password+"\" is not a strong password");
            System.exit(1);
        }

        this.password = password;
    }


    public boolean isStrongPassword(String passWord){

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;  // has Upper case letter
        boolean r3 = false;  // has lower case letter
        boolean r4 = false;  // has Digit
        boolean r5 = false; // has Special Character

        for (char each : password.toCharArray()) {

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r4 = true;
            }else{
                r5 = true;
            }
        }

        return  r1 && r2 && r3 && r4 && r5;

    }









}
