package WednesdayOfficeHours.week12.seasonClass;

public class CheckSeason {

    public static void main(String[] args) {

        Summer summer = new Summer(40,25);
        System.out.println(summer);

        summer.activity();

        System.out.println("-----------------------------------------------------");

        Fall fall =new Fall(15,0);
        System.out.println(fall);

        fall.activity();

        System.out.println("-----------------------------------------------------");

        Spring spring = new Spring(19,2);
        System.out.println(spring);

        spring.activity();

        System.out.println("-----------------------------------------------------");

        Winter winter = new Winter(15,-15 );
        System.out.println(winter);

        winter.activity();

        System.out.println("-----------------------------------------------------");

    }
}
