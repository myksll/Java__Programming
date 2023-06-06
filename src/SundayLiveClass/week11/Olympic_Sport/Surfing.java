package SundayLiveClass.week11.Olympic_Sport;

public class Surfing extends OlympicSport{


    public Surfing( int participants) {
        super("Surfing", participants);
    }

    @Override
    public void compete() {
        System.out.println(getName()+" the waves");
    }
}
