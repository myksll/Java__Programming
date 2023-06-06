package practices.day26_practices.RESTAURANT;

import java.time.LocalDate;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hire_Date;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_Date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_Date = hire_Date;
    }

    public void takeOrder(){
        System.out.println(name+"is taking an order");
    }

    public void cleanTable(){
        System.out.println(name+"is cleaning the table" );
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + (fullTime ? "full-Time" : "part-Time") +
                ", hire_Date=" + hire_Date +
                '}';
    }
}
