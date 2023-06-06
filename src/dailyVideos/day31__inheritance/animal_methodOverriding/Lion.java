package dailyVideos.day31__inheritance.animal_methodOverriding;

public class Lion extends Animal {


    private boolean isAfricanLion;

    //constructor
    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        this.isAfricanLion = isAfricanLion;
    }

    //setter getter
    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    //overriding
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    //method
    public void roar() {
        System.out.println("Lion " + getName() + " is roaring");
    }


    //toString
    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", African lion = " + isAfricanLion + '\'' +
                '}';
    }
}