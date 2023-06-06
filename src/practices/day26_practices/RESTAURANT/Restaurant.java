package practices.day26_practices.RESTAURANT;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {


    public  String owner;
    public  String Location;
    public  int numberOfStars;
    ArrayList<Server> servers ;
    ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.Location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();

    }


    public void hireServer(Server server){
       servers.add(server);
    }

    public void hireServer(Server[] servers){
       this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p-> p.employeeID ==employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}
