package dailyVideos.day27_accessModifiers;

public class Car { //Car-->object ..> outer

    public String make, model, color; //instance variables
    public int year;
    public double price;


    public static int Wheels = 4; //static variable


    public class CarEngine{ //CarEngine--> object and inner class in Car class...>inner-->should be only non_static class

        public void method(){//it can access any outer members
            System.out.println(make);
            System.out.println(Wheels);
        }
    }

    public static class StaticInnerClass{ //if the inner class is static class, you do not need an object of the other class in order to use this inner class
       // Static only accepts static
        public void method(){
           // System.out.println(make); it gives error
            System.out.println(Wheels);
        }

    }
}
