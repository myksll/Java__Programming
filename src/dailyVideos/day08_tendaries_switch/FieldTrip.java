package dailyVideos.day08_tendaries_switch;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 1;

        String location = "Unknown ";
        int numOfGroups = 0;
        String teacher = "Unknown";

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
            location = "Apple Orchard";
            numOfGroups = 3;
            teacher = "Ms. Smith";

        } else if (grade == 2) {
            location = "Zoo";
            numOfGroups = 7;
            teacher = "Mr. Lee";

        } else if (grade == 3) {
            location = "Aquarium";
            numOfGroups = 5;
            teacher = "Ms. Wilson";

        } else if (grade == 4) {
            location = "Movie theater";
            numOfGroups = 2;
            teacher = "Ms. Reyes";

        } else if (grade == 5) {
            location = "Museum";
            numOfGroups = 5;
            teacher = "Ms.Lela";

        } else {
                location = "Six Flags";
                numOfGroups = 6;
                teacher = "Mr. Watt";
            }
        }

        System.out.println("Location- "+location);
        System.out.println("Number of groups- "+numOfGroups);
        System.out.println("Teacher in charge- "+teacher);



    }
}
