package practices.day34_practices.carTask;

public class CarShop {
    public static void main(String[] args) {

        // Car car = new Car();--> ABSTRACT CLASS CAN NOT BE instantiated

        Tesla tesla = new Tesla("Tesla","Tesla Y",2020,55000,"White");

        tesla.selfDrive();
        tesla.drive();
        tesla.autoPark();
        tesla.start();
        tesla.stop();








    }
}
