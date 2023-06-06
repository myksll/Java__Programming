package dailyVideos.day36_polymorphism;

import dailyVideos.day29_inheritance.AnimalTask.Animal;
import dailyVideos.day29_inheritance.AnimalTask.Cat;
import dailyVideos.day29_inheritance.AnimalTask.Dog;
import dailyVideos.day30_inheritance.phoneTask.IPhone;
import dailyVideos.day30_inheritance.phoneTask.Nokia;
import dailyVideos.day30_inheritance.phoneTask.Phone;
import dailyVideos.day33_abstraction.employeeTask.*;
import dailyVideos.day35_polymorphism.transportationTask.AutoPilot;
import dailyVideos.day35_polymorphism.transportationTask.Electric;
import dailyVideos.day35_polymorphism.transportationTask.Tesla;
import practices.day30_practices.deviceTask.Iphone;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog); //Dog{name='null', breed='null', gender= , size='null', color='null', age=0}

         // Cat cat = new Dog(); compiler error


        //upcasting--> implicit casting. Why?-->because we can assign child object to any parent reference type
        Animal animal = new Dog();


        //down CASTING: WHY WE DO NEED?--> Reference type decides what are accessed or called

        Animal animal1 = new Dog(); //upcasting -->polymorphism
        animal1.setInfo("Max","Husky", 'M', "Large", "White", 4);
        animal1.drink();
        animal.eat();
        animal1.sleep();
        //animal1.bark(); it is not accessible , we do not hav bark method in reference type

        //down casting
        Dog dog1 = (Dog) animal1 ;

       ( (Dog) animal1) .bark();

       Dog dog2 =(Dog) animal1; //we are using the animal1 object
       dog2.bark();

        System.out.println("---------------------------------------------------------------------------------");

       // ( (Cat)animal1).scratch();  //down casting, it gives error-->.ClassCastException. Dog can not be converted to Cat, because there is not "IS A RELATIONSHIP" between cat and dog.


        System.out.println("----------------------------------------------------------------------------------");

        Phone phone =   new Nokia("XR20", "Small", "Black", 350); //upcasting

        phone.call(911);
        phone.text(12346);

       //phone.selfDefense(); we can not call these method from Nokia class , so we need to cast (convert) super class to sub class
        ( (Nokia) phone).selfDefense();//down casting



       // ( (IPhone) phone).faceTime(123456);--<it gives error-->.ClassCastException, because  phone must have relationship with IPhone, but phone has Nokia so IPhone's reference variable is Nokia. Nokia can not be converted to IPhone, because there is no relationship between Nokia and IPhone


        System.out.println("----------------------------------------------------------------------------------");

        Employee employee = new Developer("Lucy",30,'F', "C1", "Java Developer",95000,"Java");

        employee.work();

        //System.out.println(employee.getProgrammingLanguage());--> employee has not this variable so can not call. so Down casting is a must

        System.out.println(( (Developer) employee).getProgrammingLanguage());//down casting

       // Tester tester = (Tester)employee;this casting does not work, because Developer and Tester have not a relationship

        System.out.println("----------------------------------------------------------------------------------");

        Electric electric = new Tesla("Tesla","Model Y","Blue",2020,55000); //upcasting

        electric.charge();

        //down casting
        ((Tesla)electric).autoPark();
        ((Tesla)electric).selfDrive();
        ((Tesla)electric).transportPeople();

        ((AutoPilot)electric).selfDrive();


        System.out.println("----------------------------------------------------------------------------------");


        Employee employee1 =new Teacher("James", 45, 'M',"B1","Math Teacher",75000);

        Employee employee2 = new Developer("Lucy",30,'F', "C1", "Java Developer",95000,"Java");

        Employee  employee3 = new Driver("Aaron", 48, 'M',"D1","Truck Driver",90000);

        Employee  employee4 = new Tester("Emily",32,'F',"E1", "Manual tESTING",80000);

//object type decides which implementation will be executed
        employee1.work();//James is teaching--> object type's work method is executed
        employee2.work();//Lucy is coding in Jav-> object type's work method is executed
        employee3.work();//Aaron is driving--> object type's work method is executed
        employee4.work();//Emily is testing--> object type's work method is executed









    }
}
