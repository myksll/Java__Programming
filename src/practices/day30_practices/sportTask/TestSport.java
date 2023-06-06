package practices.day30_practices.sportTask;

public class TestSport {
    public static void main(String[] args) {

        Sport basketball =  new Sport("Basketball", 5,1,"Only five Player");

        basketball.setRules("Only five players");
        System.out.println(basketball.getRules());

        System.out.println(basketball);

        basketball.play();

       Basketball obj1 = new Basketball(5,1,"Only five players", 40);

        System.out.println(obj1);

        System.out.println(obj1.getNumberOfBaskets());

    }
}
