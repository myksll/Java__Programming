package practices.day29_practices.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {

   private String programmingLanguage;

    //setInfo


    @Override
    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary) {
        super.setInfo(name, gender, age, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    //setters getters
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

        if(! list.contains(programmingLanguage)){
            System.err.println("Invalid programming language: "+programmingLanguage);
            System.exit(1);
        }

        this.programmingLanguage = programmingLanguage;
    }

    //method

    public void coding(){
        System.out.println(getJobTitle()+" "+getName()+" is coding");
    }













}
