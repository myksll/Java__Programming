package practices.day18_practices;

public class Carpet {

public double width, length, unitPrice;
public boolean isPersian;


    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }
    public double calcCost() {

        double totalPrice = (width * length) * unitPrice;
        return isPersian ? totalPrice+200 : totalPrice;


        }

        public String toString () {
            return "Carpet{" +
                    "width= " + width +
                    ", length= " + length +
                    ", unitPrice=" + unitPrice +
                    ", isPersian= " + isPersian +
                    ", cost= " + calcCost() +
                    '}';

    }
}
/*

4. Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
 */