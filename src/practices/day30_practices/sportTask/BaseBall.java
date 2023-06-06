package practices.day30_practices.sportTask;

public class BaseBall extends Sport{

    private int numberOfInnings;

    public BaseBall(String name, int numberOfPlayers, int numberOfReferre, String rules, int numberOfInnings) {
        super(name, numberOfPlayers, numberOfReferre, rules);
        this.numberOfInnings = numberOfInnings;
    }

    public int getNumberOfInnings() {
        return numberOfInnings;
    }

    public void setNumberOfInnings(int numberOfInnings) {
        this.numberOfInnings = numberOfInnings;
    }
}
