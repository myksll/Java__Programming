package dailyVideos.day33_abstraction;

import dailyVideos.day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public class CydeoDevStudent extends Person {


    private final String id;  //id of the students can not be changed at the end of the course, it should be same id, that's why we use final with id.
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;  //i do not change the value so static. we are static variable for multiple steps, so I can not assign here

    //constructor
    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {

        super(name, gender, dateOfBirth);//Constructor should be called all tíme at first step

        // 	condition-->1. Age has to be at least 18 years old age was assigned at final in super class , we can write with get
        if(getAge() < 18){
            System.err.println("Cydeo Developer student must be at least 18 years old.");
            System.exit(1);
        }

        this.id = id; //we can nor re-assign it. it can only be assigned one.
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    //static
    static {
        programmingLanguage= "Java";
    }
//we have 3 instance variable( id, batch name, batch number) id is final , so we can not generate with set method, because set can change. we have 3 get method, and 2 set method (batch name, batch number)
    //getter --> for 3 variable , not problem at final

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    //setter --> for 2 variable, final is problem, final should not have setter
    public void setBatchName(String batchName) {

        if(batchName.equalsIgnoreCase("zero to Hero") || batchName.equalsIgnoreCase("alumni Dev")){
            this.batchName = batchName;

        }else{  //if the batch name is invalid
            System.err.println("Invalid batch name: "+batchName+" \n No such a batch in Cydeo");
            System.exit(1);
        }

    }

    public void setBatchNumber(int batchNumber) {

        if(batchNumber <= 0){
            System.err.println("Invalid batch number: "+batchNumber+"\nBatch number can not be negative or zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

//overridden methods --> we need different implementation
    @Override
    public void eat(){
        System.out.println(getName()+ " is eating "+ programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+ " is drinking "+ programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " does not need to sleep ");
    }


    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}


/*
1. Create a subclass of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables


 */