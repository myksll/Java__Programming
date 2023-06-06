package dailyVideos.day21_multiDimentionalArray;

public class MultiDimensionalArrayPractice3 {
    public static void main(String[] args) {
        //multiple 3 dimensional array
        int[][][] arr3D1= {{{1,2},{3,4,5}}, {{6,7,8,9},{10,11},{12,13,14}},{{15,16,17,18}}};
        int[][][] arr3D2= {{{1,2},{3,4,5}}, {{6,7,8,9},{10,11},{12,13,14}},{{15,16,17,18}}};
        int[][][] arr3D3= {{{1,2},{3,4,5}}, {{6,7,8,9},{10,11},{12,13,14}},{{15,16,17,18}}};

        int[][][][] arr4D={ arr3D1,arr3D2,arr3D3}; // for 4 dimensional array it is necessary to 3 dimensional array in 3 curly braces. there are one curly braces out 3 curly braces. sum:4 curly braces

        //for each is easier

        for (int[][][]  each3D: arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement: each1D) {
                        System.out.println(eachElement);
                    }

                }
            }

        }
    }
}
