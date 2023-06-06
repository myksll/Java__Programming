package practices.day30_practices.sportTask;

public class AmericanFootball extends Sport{



    private int numberOfTouchdowns;


    public AmericanFootball(String name, int numberOfPlayers, int numberOfReferre, String rules, int numberOfTouchdowns) {
        super(name, numberOfPlayers, numberOfReferre, rules);
        this.numberOfTouchdowns = numberOfTouchdowns;
    }

    public int getNumberOfTouchdowns() {
        return numberOfTouchdowns;
    }

    public void setNumberOfTouchdowns(int numberOfTouchdowns) {
        this.numberOfTouchdowns = numberOfTouchdowns;
    }
}
