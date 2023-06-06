package dailyVideos.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractices {
    public static void main(String[] args) {

        String[] group1 = {"James","Daniel","Jack","Anna"}; //[4]
        String[] group2 = {"Ayse","Fatma","Hayriye"}; //[3]
        String[] group3 = {"Mesut","Fatma","Songül","Aysegül","Aysun"};//[5]
        String[] group4 = {"Esra","Bekir"};//[2]

// String[][] allGroups={ {"James","Daniel","Jack","Anna"},{"Ayse","Fatma","Hayriye"},{"Mesut","Fatma","Songül","Aysegül","Aysun"},{"Esra","Bekir"}};

        String[][] allGroups={ group1,group2,group3,group4};








        System.out.println("-----------------------------------------------------------");

        //for loop
        for (int i = 0; i < allGroups.length; i++) {
            String[] groupArray= allGroups[i];
            System.out.println(Arrays.toString(groupArray));
            // [James, Daniel, Jack, Anna] [Ayse, Fatma, Hayriye]  [Mesut, Fatma, Songül, Aysegül, Aysun]  [Esra, Bekir]


            for (int j = 0; j < groupArray.length; j++) {
                String eachGroup= groupArray[j];
                System.out.println(eachGroup);
                //James Daniel Jack Anna Ayse Fatma Hayriye Mesut Fatma Songül Aysegül Aysun Esra Bekir
            }
        }
        System.out.println("---------------------------------------------------------------------");
         //for each loop

        for (String[] groupArray2 : allGroups) {

            for (String eachGroup2 : groupArray2) {

                System.out.println(eachGroup2);



            }
        }
        System.out.println("---------------------------------------------------------------------");

        //WE ARE STARTING FROM GROUP4; GROUP3; GROUP2 ; GROUP1

        for (int i = allGroups.length - 1; i >= 0; i--) {                  // we are making allGroups reverse (groupArray)
            String [] groupArray= allGroups[i];
            System.out.println(Arrays.toString(groupArray));             //[Esra, Bekir][Mesut, Fatma, Songül, Aysegül, Aysun].......reverse array

            for (int j =groupArray.length - 1; j >= 0; j--) {               // we are making every single student in each group reverse (eachGroup)
                String eachGroup=groupArray[j];
                System.out.println(eachGroup);                              // [Esra, Bekir] Bekir Esra... reverse String

            }
            }

        System.out.println("-------------------------------------------------------------------------");

        //for loop + for each

        for (int i = allGroups.length - 1; i >= 0; i--) {
            String [] groupArray= allGroups[i];
            System.out.println(Arrays.toString(groupArray));

            for(String eachGroup : groupArray) {   // [Esra, Bekir] Esra Bekir  reverse String
                System.out.println(eachGroup);
                }
            }

        System.out.println("-------------------------------------------------------------------------");

        System.out.println(Arrays.deepToString(allGroups));   //multi dimensional---->Arrays.deepToString(allGroups)



        }


    }

