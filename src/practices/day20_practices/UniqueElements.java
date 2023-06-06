package practices.day20_practices;

public class UniqueElements {
    public static void main(String[] args) {

    int[] nums= {1,1,2,5,7,8,8,9,9,10,10};



    for (int each : nums){

        int count = 0;

        for (int element :  nums){

            if( each==element){
                count++;
            }
        }

        if(count==1){
            System.out.print(each);
        }

    }


    }
}
/*
4. Write a program that can display the unique elements of an array

			MUST use for each loops


 */