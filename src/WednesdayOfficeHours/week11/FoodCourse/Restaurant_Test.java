package WednesdayOfficeHours.week11.FoodCourse;

public class Restaurant_Test {


    public static void main(String[] args) {

        FoodCourse course1=new FoodCourse();
        course1.setInfo("Cydeo", 1150);

        System.out.println(course1);//FoodCourse{name='Cydeo', price=1150.0}

        course1.setName("CMeal");
        System.out.println(course1.getName());//CMeal

        course1.setPrice(1788);
        System.out.println(course1.getPrice()); //1788.0

        System.out.println("------------------------------------------");

        Entree entree1= new Entree();

        entree1.setInfo("MEal meal",500);

        entree1.setName("meal here");
        System.out.println(entree1.getName());//meal here

        entree1.setTypeOfMeal("European");
        System.out.println(entree1.getTypeOfMeal());//European

        System.out.println("------------------------------------------");

        Taco taco1=new Taco();

        taco1.setPrice(258);
        System.out.println(taco1.getPrice());//258.0

        System.out.println("------------------------------------------");

        Fish fish1 = new Fish("Sardalia");


        fish1.setFishType("Sardalia");
        System.out.println(fish1.getFishType());

        System.out.println("------------------------------------------");

    }
}
