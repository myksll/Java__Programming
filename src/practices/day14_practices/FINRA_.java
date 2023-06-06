package practices.day14_practices;



public class FINRA_ {

    public static void main(String[] args) {

        String result = "";

        for (int i = 1; i < 101; i++) {

            if( i % 15==0){
                result += "FINRA ";
            }else if (i % 5==0){
                result += "RA ";
            }else if(i % 3 ==0){
                result += "FIN ";
            }else{
                result += i+" ";
            }
        }
        System.out.println(result);
    }
}
        /*
        // saim' solution

           String result = "";
        for (int i = 1; i < 101; i++) {

            if (i % 15 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            }else if(i%3==0){
                result += "FIN ";
            }else{
                result += i +" ";
            }

        }

        System.out.println(result);

         */











