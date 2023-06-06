package dailyVideos.day37_exceptions;

import dailyVideos.day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {


        System.out.println("Program1 started");

        Car car =  null;//.NullPointerException


        try {
            car.drive(); //if we do not have the car, we can not call the car object-->compile //.NullPointerException

        }catch(ArithmeticException e){
            System.out.println("First catch block");
            e.printStackTrace();
        } catch(ClassCastException e){
            System.out.println("second catch block");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("third catch block");  //this exception type is true, so it is printed, the other blocks are not executed
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }catch(RuntimeException e) {
            System.out.println("fifth catch block");
            e.printStackTrace();
        }
        System.out.println("Program1 ended");





    }

}
