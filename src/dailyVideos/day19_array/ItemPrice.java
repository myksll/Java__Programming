package dailyVideos.day19_array;

import java.util.Scanner;

public class ItemPrice {
    public static void main(String[] args) {

     String[] itemName = new String[5];
     double[] priceOfItem = new double[5];

     Scanner input =new Scanner(System.in);



        for (int i = 0; i < itemName.length; i++) {

            System.out.println("Enter item name"); //"book"
            String item = input.next();
             itemName[i]=item;

            System.out.println("Enter the price of item "); //5
            double price = input.nextDouble();
            priceOfItem[i] = price;


        }


        for (int i = 0, j=0; i < 5; i++,j++) {

            System.out.println(itemName[i]+"=" +priceOfItem[j]);

        }


    }
}
/*


    6. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price

 */