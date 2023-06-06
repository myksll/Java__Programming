package SundayLiveClass.week10.books;

public class Book {


   private String title, author, genre, chapters;
   private int numberOfPages;
   private boolean hasAMovie;


    public void setInfo(String title, String author, String genre, String chapters, int numberOfPages, boolean hasAMovie) {
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setChapters(chapters);
        setNumberOfPages(numberOfPages);
        setHasAMovie(hasAMovie);
    }

    //------------------------------------------
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isHasAMovie() {
        return hasAMovie;
    }

    public void setHasAMovie(boolean hasAMovie) {
        this.hasAMovie = hasAMovie;
    }




    public void read(){
        System.out.println(author+ " is reading "+numberOfPages);
    }


    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapters='" + chapters + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", hasAMovie=" + hasAMovie +
                '}';
    }
}
