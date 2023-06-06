package practices.day08_practices;

public class CydeoBatches {
    public static void main(String[] args) {

   String batchTypes="US morning";

   String result="";


   //1. solution if statements


        if(batchTypes=="US morning"|| batchTypes=="US evening" || batchTypes=="EU"){

            if(batchTypes=="US morning"){
                result="Class times are 10-5 EST. M, T, Th, F.";
            }else if (batchTypes=="US evening" ){
                result="Class times are 7-10 EST. M, T, W, Th, S, S";
            }else{
                result="Class times are  10-5 EST. M, T, W, Th, F.";
        }
              }else{
               result="Invalid Batch";
        }

            System.out.println(result);

        System.out.println("--------------------------------------------------------------------------");
        //2. solution switch

        switch(batchTypes){

            case "US morning":
                result="Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                 result="Class times are  10-5 EST. M, T, W, Th, F.";
                 break;
            default:
                result="Invalid Batch";
                 break;

        }

        System.out.println(result);


        System.out.println("-------------------------------------------------------------------------------------");

// 3. solution if&switch statements mixes


        if(batchTypes=="US morning"|| batchTypes=="US evening" || batchTypes=="EU") {

            switch(batchTypes){

                case "US morning":
                    result="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result="Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                case "EU":
                    result="Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
                default:
                    result="Invalid Batch";
                    break;

            }
        }


        System.out.println(result);



    }
}





