package WednesdayOfficeHours.week11.workout;

public class TestWorkout {

    public static void main(String[] args) {


        Workout obj1= new Workout("Basketball", 55, 200);

        System.out.println(obj1);


        //all of them are invalid(only for testing)
         //obj1.setName("ajsha9");

         //obj1.setDuration(-96);
        //System.out.println(obj1.getDuration());

        obj1.setCaloriesBurned(96);
        System.out.println(obj1.getCaloriesBurned());


        obj1.setName("Push up");
        obj1.setDuration(50);
        obj1.setCaloriesBurned(100);

        System.out.println(obj1.getName());

        System.out.println(new Workout("",10,10).getName());









    }
}
