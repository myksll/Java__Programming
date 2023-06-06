package practices.day12_practices;

public class dayOfMonth {

    public static void main(String[] args) {

      dayOfMonth("fEBRUARY");


    }

     public static void dayOfMonth (String month){

         month=month.toUpperCase().substring(0,1)+month.toLowerCase().substring(1);

         if((month.equals("January")) ||  (month.equals("March"))  || (month.equals("May"))||(month.equals("July"))
         ||  (month.equals("August"))  || (month.equals("October")) ||(month.equals("December"))){

            System.out.println(month+" has 31 days");

         }else if(month.equals("February")){
            System.out.println(month+" has 28 days");
         }else if((month.equals("April")) ||  (month.equals("June"))  || (month.equals("September"))||(month.equals("November")))
               {
            System.out.println(month+" has 30 days");
         }else{
            System.out.println("invalid");
         }



     }










}
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days

 */