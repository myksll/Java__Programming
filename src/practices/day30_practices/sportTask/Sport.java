package practices.day30_practices.sportTask;

public class Sport {

    //instance
    private String name;
    private int numberOfPlayer, numberOfReferee;
    private String rules;


    //constructor
    public Sport(String name, int numberOfPlayer, int numberOfReferee, String rules) {
        setName(name);
        setNumberOfPlayer(numberOfPlayer);
        setNumberOfReferee(numberOfReferee);
        setRules(rules);
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {

        if (numberOfPlayer > 0) {
            this.numberOfPlayer = numberOfPlayer;
        }
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {

        if(numberOfReferee > 0){
            this.numberOfReferee = numberOfReferee;
        }
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    //methods
    public void play(){
        System.out.println(name+ " is playing ");
    }

    //toString
    public String toString() {
        return   getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }
}
