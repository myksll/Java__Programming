package practices.day26_practices.RESTAURANT;

import java.time.LocalDate;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server[]  server1 = {
                new Server("YASIN",2564,12,true, LocalDate.of(2022,12,4)),
                new Server("Karim",24564,10,false, LocalDate.of(2023,1,4)),
        };

        Chef[] chef1 = {
                new Chef("Sabryne",456,14,false),
                new Chef("Kamal",458,19,true),
        };

        Restaurant restaurant1 = new Restaurant("Dugeki lüpü","Mannheimer Strasse",5);

        restaurant1.hireChef(chef1);
        restaurant1.hireServer(server1);

        System.out.println(restaurant1);//Restaurant{owner='Dugeki lüpü', Location='Mannheimer Strasse', numberOfStars=5, number of servers=2, number of chefs=2}



    }
}
