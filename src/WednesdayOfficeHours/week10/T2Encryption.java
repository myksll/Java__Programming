package WednesdayOfficeHours.week10;

public class T2Encryption {

    public String message;
    public int modifyNumber;
    public int factorNumber;

    public T2Encryption(String message) {
        this.message = message;
    }

    public T2Encryption(String message, int modifyNumber, int factorNumber) {
        this(message);
        this.modifyNumber = modifyNumber;
        this.factorNumber = factorNumber;
        encrypt();
    }

    public void encrypt(){
          String encrypted= "";

          for(char each : message.toCharArray()){
             encrypted+=(each+modifyNumber) * factorNumber +" ";
          }

          message = encrypted.trim();
    }







}


