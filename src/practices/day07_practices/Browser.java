package practices.day07_practices;

public class Browser {
    public static void main(String[] args) {

        String browserName ="edge";
        String result= "Invalid Browser Name ";


        if(browserName=="chrome"|| browserName=="firefox"|| browserName=="opera"||
           browserName=="safari"||browserName=="edge") {

            if (browserName == "chrome") {
                result= "Chrome browser is selected";
            }else if (browserName == "firefox") {
                result= "Firefox browser is selected";
            }else if (browserName == "opera") {
                result= "Opera browser is selected";
            } else if (browserName == "safari") {
                result= "Safari browser is selected";
            } else {
                result= "Edge browser is selected";
            }

        }


        System.out.println(result);


















    }
}
