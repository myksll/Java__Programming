package dailyVideos.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;


public class President extends Person{


    private LocalDate electedDate;

    //constructor
    public President(String name, char gender, LocalDate dateOfBirth, LocalDate electedDate) {
        super(name, gender, dateOfBirth);
       setElectedDate(electedDate);
    }

    //setter getter
    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    //method
    public void lie(){
        System.out.println(getName()+" is lying");
    }



}
