package SundayLiveClass.week5;

public class MultiplicationTable {


    public static void multiplicationTable(int number) {

        for (int i = 1; i <=10; i++ ) {

            System.out.println(number+" x "+ i + " = " + (number * i));
        }


    }
}
/*

multiplication Table [methods, loops]

	create a method that will accept a number. Print the multiplication table for the give number up until 10

	print the results in this format:
		$number x 1 = result
		$number x 2 = result
		...
		$number x 10 = result

		ex:
			number = 4
			4 x 1 = 4
			4 x 2 = 8
 */