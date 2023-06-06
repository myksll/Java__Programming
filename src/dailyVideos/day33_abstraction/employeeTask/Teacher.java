package dailyVideos.day33_abstraction.employeeTask;

public  class Teacher extends Employee{
    //there is an abstract method in parent class this method is  inherited from parent , i need to use abstract in child class, otherwise it give compiler error. but in abstract method, we can not use body. we have to use body in this class, so we will delete abstract, try to another way

//constructor
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

@Override
    public void work(){
        //while overriding, we do not use abstract that means no body. and the compiler at class name will be handled.

    System.out.println(getName() + " is teaching");
    }



    //









}
