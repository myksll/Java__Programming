package SundayLiveClass.week11.Olympic_Sport;

public class Soccer extends OlympicSport{

    public Soccer(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println("Playing a soccer game");
    }
}
