package practices.day36_practices;

import dailyVideos.day34_abstraction.carTask.Audi;
import dailyVideos.day34_abstraction.carTask.Honda;
import dailyVideos.day34_abstraction.carTask.Tesla;
import dailyVideos.day34_abstraction.carTask.Car;

import java.util.ArrayList;

public class Cars {
    public static void main(String[] args) {


        Car[] cars = {
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Pilot", "White", 2010, 25000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000)
        };

/*
  1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016
 */

        for (Car each : cars){
            if(each.getMake().equals("Honda")){
                if(each.getYear()==2010 ||each.getYear()==2011 ){
                    System.out.println(each.getMake()+" "+each.getModel()+ ": from year 2010 to 2011");
                }
            }

            if(each.getMake().equals("Audi")){
                if(each.getYear()>=2015 && each.getYear()<=2019 ){
                    System.out.println(each.getMake()+" "+each.getModel()+ ": from year 2015 to 2019");
                }

            }

            if(each.getMake().equals("Tesla")){
                if(each.getYear()==2015 || each.getYear()==2016 ){
                    System.out.println(each.getMake()+" "+each.getModel()+ ": from year 2015 to 2016");
                }

            }
        }
            System.out.println("----------------------------------------------------------------------------------------");

            //1.3 Write a program that can display the car that has the highest price
//my solution
            double max = 0;
            for (Car eachCar : cars) {
                if(eachCar.getPrice() > max){
                    max= eachCar.getPrice();
                }
            }
            System.out.println(max+" is max");

        System.out.println("----------------------------------------------------------------------------------------");

          //1.3 Write a program that can display the car that has the lowest price
//my solution

        Car carLowest = cars[0];

        for (Car each : cars) {
            if(each.getPrice()<carLowest.getPrice()){
                carLowest = each;
            }
        }
        System.out.println(carLowest);//Honda{ model='Accord', color='White', year=2011, price= $20000.0}

        System.out.println("----------------------------------------------------------------------------------------");

        //1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
        //						ArrayList<Tesla> teslaCars = new ArrayList<>()

        ArrayList<Tesla> teslaCars = new ArrayList<>();

        for (Car each : cars) {
            if(each instanceof Tesla){
                teslaCars.add((Tesla)each);
            }
        }

        System.out.println(teslaCars);


        ArrayList<Honda> hondaCars =new ArrayList<>();

        for (Car each : cars) {
            if(each instanceof Honda){
                hondaCars.add((Honda) each);
            }
        }
        System.out.println(hondaCars);

        System.out.println("------------------------------------------------------------------------------------");
    }
}
