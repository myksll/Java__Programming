package practices.day31_practices.statesTask;

import javax.print.attribute.standard.MediaSize;

public class States {

    private String name, abbreviation, politicalParty, Governor, senator;
    private double population, stateTax;

    //constructor
    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }


    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name == null || name.isBlank() || name.isEmpty()){
            System.err.println("It can not be null. empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation == null || abbreviation.isBlank() || abbreviation.isEmpty()){
            System.err.println("It can not be null. empty or blank");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty == null || politicalParty.isBlank() || politicalParty.isEmpty()){
            System.err.println("It can not be null. empty or blank");
            System.exit(1);
        }
        this.politicalParty =politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if(governor == null || governor.isBlank() || governor.isEmpty()){
            System.err.println("It can not be null. empty or blank");
            System.exit(1);
        }
        this.Governor=governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator== null || senator.isBlank() || senator.isEmpty()){
            System.err.println("It can not be null. empty or blank");
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if(population<=0){
            System.err.println("It can not be negative");
            System.exit(1);
        }
        this.population= population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {

        if(stateTax<0){
            System.err.println("It can not be negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
