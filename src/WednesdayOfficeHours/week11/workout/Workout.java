package WednesdayOfficeHours.week11.workout;

public class Workout {


    private String name;
    private double duration;
    private double caloriesBurned;


    public Workout(String name, double duration, double caloriesBurned) {
        setName(name);
        setDuration(duration);
        setCaloriesBurned(caloriesBurned);
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {

        boolean isValid= true;


        if(name.isEmpty()){
            return;
        }

        for (int i=0; i< name.length(); i++){
            if ( !Character.isLetter(name.charAt(i))  && name.charAt(i) !=' '){
                isValid=false;
                break;
            }
        }

        if(isValid){
            this.name=name;
        }
    }


    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {

        if(duration <= 0){
            System.err.println("The Duration can not be zero and negative");
            System.exit(1);
        }
        this.duration = duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {

        if(caloriesBurned <=0 || caloriesBurned>=1000){
            System.err.println("Invalid calorie burned: "+caloriesBurned);
            System.exit(1);
        }
        this.caloriesBurned = caloriesBurned;
    }

    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}
