package dailyVideos.day09_scanner;

public class CrewAndPassengers {

        public static void main(String[] args) {

            int numOfPeople= 75;

 System.out.println("------------------------------------------------Ternary------------------------------------------------------------------");
            String result1=  (numOfPeople==50 || numOfPeople==75 || numOfPeople==100)?

                    (numOfPeople==50) ?   "20 crew , 30 passenger"
                            : (numOfPeople==75) ?  "25 crew , 50 passenger"
                            : "30 crew , 70 passenger"
                    :"Invalid ";

            System.out.println(result1);

 System.out.println("---------------------------------------------------IF------------------------------------------------------------------");

            String result2="Invalid ";

            if (numOfPeople==50 || numOfPeople==75 || numOfPeople==100){

                if(numOfPeople==50){
                    result2= "20 crew , 30 passenger";
                }else if(numOfPeople==75){
                    result2= "25 crew , 50 passenger";
                }else {
                    result2 = "30 crew , 70 passenger";
                }

            }

            System.out.println(result2);

System.out.println("-------------------------------------------------SWITCH---------------------------------------------------------");

            String result3="";



            switch (numOfPeople){

                case 50:
                    result3="20 crew , 30 passenger";
                    break;
                case 75:
                    result3="25 crew , 50 passenger";
                    break;
                case 100:
                    result3="30 crew , 70 passenger";
                    break;

                default:
                    result3="Invalid";
                    break;
            }

            System.out.println(result3);

























        }
}
