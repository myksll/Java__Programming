package practices.day21_practices;

import java.util.Arrays;

public class CydeoStudents {
    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String [][] batch1Groups = {batch1Group1,batch1Group2,batch1Group3} ; //deepToString

        System.out.println(Arrays.deepToString((batch1Groups)));



        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups ={batch2Group1,batch2Group2,batch2Group3};

        String[][][]  CydeoStudents= {batch1Groups,batch2Groups};

//for loop

        //each2D--> eachBatch   each1D---> eachGroup   eachElement--->eachStudent

        for (int i = 0; i < CydeoStudents.length; i++) {
            String[][] each2D = CydeoStudents[i];

            for (int j = 0;j< each2D.length; j++) {
                String[] each1D = each2D[j];

                for (int k = 0; k< each1D.length; k++) {
                     String eachElement=each1D[k];

                    System.out.println(eachElement); //Ahmet Baturay Beyza........
                }
            }
        }

//for each loop



        for (String[][] each2D : CydeoStudents) {
            for (String[] each1D : each2D) {
                for (String eachElement : each1D) {
                    System.out.println(eachElement); //Ahmet Baturay Beyza........
                }

            }

        }


    }
}
/*batch1Groups ---> each Students

 for (int i = 0; i < batch1Groups.length; i++) {
        String[] eachArray=batch1Groups[i];

        for (int j = 0; j < eachArray.length; j++) {
        String  eachElement=eachArray[j];
        System.out.println(eachElement); //Ahmet Baturay Beyza Dilara Muhtar Entisar Ermek....
        }
        }

 */
