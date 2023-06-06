package SundayLiveClass.week11.Olympic_Sport;

public class OlympicSport {

    //instance

    private String name;
    private int participants;

    //static
    public static int yearOfFirstOlympics;


    static{

        yearOfFirstOlympics=1896;
    }

    //constructor


    public OlympicSport(String name, int participants) {
       setName(name);
       setParticipants(participants);
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    //methods
    public void compete(){

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}
