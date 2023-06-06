package dailyVideos.day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {

      Dog dog1 = new Dog();

      dog1.name = "Max";
      dog1.breed = "Husky ";
      dog1.gender='M';
      dog1.age = 4;
      dog1.size = "Large";
      dog1.color = "Gray";

/*    dog1.eat();              //   Max is eating dog food.
      dog1.drink();           //    Max is drinking water.
      System.out.println(dog1); // dog class //a.day01_introToProgramming.day17_customClass.Dog@edf4efb
*/

      Dog dog2 = new Dog();
      dog2.name = "Bella";
      dog2.breed = "Golden Retriever ";
      dog2.gender= 'F';
      dog2.age = 2;
      dog2.size = "Small";
      dog2.color = "Orange";


      Dog dog3 = new Dog();
      dog3.setInfo("Loki", "Husky", 'M', 5, "Small", "Black");


      System.out.println(dog1);


      //Dog{name='Max', breed='Husky', size='Large', gender='M', age=4, color='Gray'}


      System.out.println(dog2);


      // first appearance----> Dog{name='null', breed='null', size='null', gender='null', age=0, color='null'}

      //after assigned the objects--->Dog{name='Bella',breed='Golden Retriever ', size='Small', gender='F', age=2, color='Orange'}

      System.out.println(dog3);

      dog3.eat(); //Loki is eating dog food.(instance method)

      dog2.drink(); //Bella is drinking water.


    }
}
