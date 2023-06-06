package SundayLiveClass.week10.books;

public class EBook extends Book {

    private double size;
    public boolean onKindle;

    public void setInfo(double size, boolean onKindle) {
        setSize(size);
        setOnKindle(onKindle);
    }

    //------------------------------
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isOnKindle() {
        return onKindle;
    }

    public void setOnKindle(boolean onKindle) {
        this.onKindle = onKindle;
    }

    public void open(){
        System.out.println(getNumberOfPages()+" is open");
    }

    public String toString() {
        return "EBook{" +
                "size=" + size +
                ", onKindle=" + onKindle +
                '}';
    }
}
