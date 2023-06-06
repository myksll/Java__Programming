package SundayLiveClass.week13.exerciseTask;

public class Gym {
    public static void main(String[] args) {

        //Exercise exercise1 = new Exercise();--> abstract class can not have objects. can not instantiate abstract class

        Running running = new Running();
        System.out.println(running.getCaloriesBurned(75));
        running.perform();

       // Lifting lifting = new Lifting(); -->abstract class can not have objects

        Bench bench = new Bench();
        System.out.println(bench.getCaloriesBurned(50));
        bench.perform();
        bench.rackWeight();



    }
}
/*
create a class Gym to test the objects and methods
 */