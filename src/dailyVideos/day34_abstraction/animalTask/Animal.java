package dailyVideos.day34_abstraction.animalTask;

public abstract class Animal {

        private String name, breed ;
        private final char gender; //has never  set method
        private int age;
        private String size, color;


        //constructor
        public Animal(String name, String breed, char gender, int age, String size,String color) {
            setName(name);
            setBreed(breed);
            this.gender=gender;
            setAge(age);
            setSize(size);
            setColor(color);
        }


        //setter getter
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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor(){
            return color;
        }
        private void setColor(String color) {
        }

        //methods
        public void drink(){
            System.out.println(name+" is drinking water");
        }

        public abstract void eat ();

        public void sleep(){
            System.out.println(name+" is sleeping 8 hours");//but some animals sleep more or less
        }



        //toString
        public String toString() {
            return  getClass().getSimpleName()+"{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
}
/*
Animal task:
	interface Swimmable
		swim()

	interface Flyable
			fly();

	interface Wild:
			hunt();

	interface Plyable
			play();


	abstractClass Animal:
		eat();
		drink();



	Dog extend Animal implements Plyable, Swimmable

	Cat extend Animal implements Plyable

	Cow extend Animal implements Plyable

	Horse extend Animal implements Plyable

	Parrot extend Animal implements Plyable, Flyable

	Eagle extend Animal implements Wild, Flyable

	Tiger extend Animal implements Wild

	Lion extend Animal implements Wild

	Falcon extend Animal implements Wild, Flyable

	Shark extend Animal implements Wild, Swimmable

	Dolphin extend Animal implements Plyable, Swimmable

	Duck extend Animal implements Plyable, Swimmable, Flyable

	Java extend Animal implements Plyable, Swimmable, Flyable, Wild



Person implement Swimmable, Playable

Boat implement Swimmable

Airpalne implements Flyable

CydeoCar implement Swimmable, Flyable

PlayStation implements Playable


 */