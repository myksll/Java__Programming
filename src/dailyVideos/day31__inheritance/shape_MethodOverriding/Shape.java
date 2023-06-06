package dailyVideos.day31__inheritance.shape_MethodOverriding;

public  class Shape {

    private String name;

    //Constructor
    public Shape() {
       setName(getClass().getSimpleName());
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //return method
    public double area(){
        return 0 ;
    }

    public double perimeter(){
        return 0;
    }

    //void method
    public void draw(){  //we will work on the implementation of draw method in child class
        System.out.println("Drawing a "+getClass().getSimpleName());
    }


    //toString
    @Override
    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" +perimeter() + '\'' +
                '}';
    }
}
