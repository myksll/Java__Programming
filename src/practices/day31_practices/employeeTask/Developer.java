package practices.day31_practices.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String ID, double salary, String companyName, String jobTitle, String programmingLanguage) {
        super(name, age, gender, ID, salary, companyName, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println(getJobTitle()+" "+ getName()+ " is coding in "+getProgrammingLanguage());
    }







}
