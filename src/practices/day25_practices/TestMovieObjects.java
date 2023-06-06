package practices.day25_practices;

import java.time.LocalDate;
import java.util.Arrays;

public class TestMovieObjects {
    public static void main(String[] args) {

          movie movie = new movie("USA","Java Developer,Zero to Hero","Adventure, Comedy, Thriller","Kuzzat Altay", LocalDate.of(2021,4,18));

          String[] casts = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};
          movie.addCasts(casts);
          System.out.println(movie);




        /*String gene = "Adventure, Comedy, Thriller";
        String title = "Java Developer: Zero to Hero";
        String[] casts = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        movie movie1 = new movie("USA", title, gene,"Kuzzat Altay" , LocalDate.of(2022, 4, 18));
        movie1.addCasts(casts);

        System.out.println(movie1);

         */
    }
}
