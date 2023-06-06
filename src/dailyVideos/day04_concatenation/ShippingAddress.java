package dailyVideos.day04_concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name= "Aaron Kissinger",
                buildingNumber= "13621A",
                streetName= " Legacy Circle",
                city= "Fairfax",
                state="VA",
                zipCode= "22030";

        System.out.println("Your shipping addres is:");
        System.out.println("\t"+name);
        System.out.println("\t"+buildingNumber+ " "+streetName);
        System.out.println("\t"+city+","+state+" "+zipCode);


    }
}
