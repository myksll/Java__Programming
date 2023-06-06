package practices.day08_practices;

public class Browser {
    public static void main(String[] args) {


        String browserName="edege";

        String result="";

        switch (browserName){

            case "chrome":
                result="Chrome is opening";
                break;
            case "firefox":
                result="Firefox is opening";
                break;
            case "opera":
                result="Opera is opening";
                break;
            case "safari":
                result="Safari is opening";
                break;
            case "edge":
                result="Edge is opening";
                break;
            default:
            result= browserName+ " is invalid browser";
            break;










        }


        System.out.println(result);






    }
}
