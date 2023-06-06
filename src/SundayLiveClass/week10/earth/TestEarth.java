package SundayLiveClass.week10.earth;

import java.util.ArrayList;
import java.util.Arrays;

public class TestEarth {
    public static void main(String[] args) {


        //ArrayList<Person> northAmerica =new ArrayList<>(); -> I try to access this ArrayList

        Earth.northAmerica.add(new Person("James",30));

        Earth.northAmerica.addAll(Arrays.asList(

                new Person("Anna",25),
                new Person("Anni",54)
        ));









    }
}
