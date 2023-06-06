package dailyVideos.day30_inheritance.phoneTask;

public class Nokia extends Phone{

//constructor
    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size,price,color);
    }

    public void selfDefense(){
        System.out.println(getBrand() +" "+ getModel()+" can be used for self defense");
    }



}


/*
	2.3 Nokia:
					Extra methods:
						selfDefense()



 */

    /*
    public void method(){
        super(brand, model, size, price, color);  //we can not call regular method with super method
    }
     */