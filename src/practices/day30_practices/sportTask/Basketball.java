package practices.day30_practices.sportTask;

public class Basketball extends Sport {


    private int numberOfBaskets;

    public Basketball( int numberOfPlayers, int numberOfReferre, String rules, int numberOfBaskets) {
        super("Basketball", numberOfPlayers, numberOfReferre, rules );
        this.numberOfBaskets = numberOfBaskets;
    }

    public int getNumberOfBaskets() {
        return numberOfBaskets;
    }

    public void setNumberOfBaskets(int numberOfBaskets) {
        this.numberOfBaskets = numberOfBaskets;
    }









}
