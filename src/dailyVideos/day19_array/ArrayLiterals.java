package dailyVideos.day19_array;


import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5];//allocated in heap memory

        int[] nums = {10, 20, 30, 40, 50}; //Array literal ---> allocated in heap memory

        System.out.println(numbers.length);   //5
        System.out.println(nums.length);     //5


        System.out.println("numbers: " + Arrays.toString(numbers));   //numbers: [0, 0, 0, 0, 0]
        System.out.println("nums: " + Arrays.toString(nums));       //nums: [10, 20, 30, 40, 50]

        System.out.println("-----------------------------------------------------------------");

        // days
        
        
        //1.way
        String[] days = new String[7];

        days[0] = "monday";
        days[1] = "tuesday";
        days[2] = "wednesday";
        days[3] = "thursday";
        days[4] = "friday";
        days[5] = "saturday";
        days[6] = "sunday";


        //2.way --->easy


        // element       1          2        3          4           5       6          7
        String[] day = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday",};
        // index:        0          1        2          3           4       5          6

        int n = 1;  // if the user print element number, they will reach the index number of day.

        System.out.println(day[n - 1]);
        // monday-->  index number starts 0 we are expecting the users to give 1~7 you will convert the index number by self


        System.out.println("-----------------------------------------------------------------");

           //months
        
        String[] months={"january","February","march","april","may","june","july","august","september","october","november","december",};
            //this way is a lot shorter



        /*
        months= new String [12];
        months[0]="January";
        ...
         */




        int month=1;
        System.out.println(months[month-1]); // january only one month

        System.out.println("months = " + Arrays.toString(months)); //all of months [january, February, march, april, may, june, july, august, september, october, november, december]


        System.out.println("-----------------------------------------------------------------");


   //    int[] numbers2= new int [100]; // any  array object(array literal=array object) also , you can iterate by using loop

      // I want to print  reverse order of months (by using loop)

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }





    }
}
