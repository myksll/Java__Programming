package dailyVideos.day21_multiDimentionalArray;

public class ArrayContains {
    public static void main(String[] args) {
        int[] arr1={4,5,7,9,3,10,45,78,56};
        int element=11;

        boolean contains= false;
        for (int i = 0; i < arr1.length; i++) {
         int eachArray =arr1[i];
            System.out.println(eachArray);

            if(eachArray==element){
              contains=  true;
            }
        }

        System.out.println(element + " contains in array = "+contains);




}
}
