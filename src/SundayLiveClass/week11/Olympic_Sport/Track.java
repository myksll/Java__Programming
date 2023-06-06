package SundayLiveClass.week11.Olympic_Sport;

public class Track extends OlympicSport{

    public Track(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println(getName()+" for running, jumping, throwing");
    }
}
