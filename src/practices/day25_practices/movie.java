package practices.day25_practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formattable;

public class movie {

    public String country, title, Genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts;

    public movie(String country, String title, String genre, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;

        Genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        casts = new ArrayList<>();
    }

    public void addCast  (String names){
        casts.add(names);
    }
    public void addCasts  (String[] names){
        casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", total number of casts =" + casts.size() +
                '}';
    }
}
