package SundayLiveClass.week6;

public class Item {
    /*
        create a class called Item
        declare these instance variables:
            name, quantity, unitPrice
    */
    public String name;
    public int quantity;
    public double unitPrice;
    int bought = 0;
    int rest = quantity - bought;


    //create a setInfo() method to initialize these variables

    public void setInfo(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

    }

    /*
        create a sellItem method that will accept an argument for how many items you want to buy
            first check if there is enough quantity left of the item
                if there is enough print:
                    Selling: $quantity $name for $totalPrice
                        - calculate the totalPrice by doing the quantity being bought and unitPrice
                        - afterward reduce the quantity of the item from how many were sold
    */
    public void sellItem(int number) {

        if (quantity >= number) {
            System.out.println(quantity + " " + name + " for " + (unitPrice * number));
            quantity -= number;
        } else {
            System.out.println("Sorry we only have " + quantity);
        }

    }
    //create a toString() that shows the item information in the following format:
    //  ITEM: $name | $quantity | $unitPrice

    public String toString() {
        return "ITEM: " + name + " | " + quantity + " | $" + unitPrice;
    }
}
/*
Item [object type]



	create a different class and create some Item objects
 */