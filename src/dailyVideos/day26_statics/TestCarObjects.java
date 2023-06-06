package dailyVideos.day26_statics;

public class TestCarObjects {
    public static void main(String[] args) {


        Car car1 = new Car("Audi");
        System.out.println(car1);

        Car car2 = new Car("Audi", "A3");
        System.out.println(car2);

        Car car3 = new Car("Audi", "A3", 2023);
        System.out.println(car3);

        Car car4 = new Car("Audi", "A3", 2023, 120.245);
        System.out.println(car4);

        Car car5 = new Car("Audi", "A3", 2023, 120.245, "pink");
        System.out.println(car5);

    }
}
