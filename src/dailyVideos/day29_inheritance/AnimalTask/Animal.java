package dailyVideos.day29_inheritance.AnimalTask;

public class Animal {

//PARENT -->INHERITANCE

    //instance ~ privar -->it should be accessible

    private String name; // now we used privar but private is the best choice
    private String breed;
    private char gender;
    private String size;
    private String color;
    private int age;

    public static boolean isAnimal;  //private ~ static

    static {
        isAnimal = true;
    }

    //setInfo() method
    public void setInfo(String name, String breed, char gender, String size, String color, int age) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setSize(size);
        setColor(color);
        setAge(age);
    }

    //methods

    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void drink() {
        System.out.println(name+" is drinking");
    }
    public void sleep() {
        System.out.println(name+" is sleeping");
    }

    //Getters ~ Setters

//-------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //-------------------------------------
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

}
/*
Custom Classes:
	0. Animal
			attributes:
					name, breed, gender, size, color, age
			methods:
				setInfo(), eat(), sleep(), drink(), toString()
	1. Dog
			attributes:
			methods:
					 bark()
	2. Cat
			attributes:
			methods:
				meow(), scratch()
	3. Tiger
			attributes:
 */