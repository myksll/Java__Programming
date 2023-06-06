package dailyVideos.day06_ifStatements;

public class MonthName {

    public static void main(String[] args) {


        int n= 5;

        boolean isJanuary= n==1;
        boolean isFebruary= n==2;
        boolean isMarch= n==3;
        boolean isApril= n==4;
        boolean isMay= n==5;
        boolean isJune= n==6;
        boolean isJuly= n==7;
        boolean isAugust= n==8;
        boolean isSeptember= n==9;
        boolean isOctober= n==10;
        boolean isNovember= n==11;
        boolean isDecember= n==12;

        String result="";


        if (isJanuary) {
            result = "January";
        }
        if (isFebruary) {
            result = "February";
        }
        if (isMarch) {
            result = "March";
        }
        if (isApril) {
            result = "April";
        }
        if (isMay) {
            result = "May";
        }
        if (isJune) {
            result = "June";
        }
        if (isJuly) {
            result = "July";
        }
        if (isAugust) {
            result = "August";
        }
        if (isSeptember) {
            result = "September";
        }
        if (isOctober) {
            result = "October";
        }
        if (isNovember) {
            result = "November";
        }
        if (isDecember) {
            result = "December";
        }

        System.out.println(result);















    }
}
