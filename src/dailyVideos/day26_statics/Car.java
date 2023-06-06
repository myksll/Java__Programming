package dailyVideos.day26_statics;

import java.util.Arrays;

public class Car {

    public String make, model;
    public int year;
    public double price;
    public String color;


    public Car (String make){  //1
       this.make=make;
    }

    public Car (String make, String model){ //2
        this(make);
        this.model=model;
    }

    public Car (String make, String model, int year){ //3
        this(make,model);
        this.year=year;
    }

    public Car (String make, String model, int year, double price ){ // 4
        this(make, model,year);
        this.price=price;
    }

    public Car (String make, String model, int year, double price, String color){ //5
        this(make, model, year, price);
        this.color=color;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
class name: Car
		 instance variables:
		 		make, model, year, price, color

	 		1st constructor: initializes the make ONLY

	 		2nd constructor: initializes make & model
	 				(MUST use constructor call to set the make)

			3rd constructor: initializes make, model, year
					(MUST use constructor call to set the make, model)

			4th constructor: initializes make, model, year, price
					(MUST use constructor call to set the make, model, year)

			5th Constructor: initializes all the instances
					(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString

 */