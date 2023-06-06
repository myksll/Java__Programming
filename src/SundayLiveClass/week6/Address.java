package SundayLiveClass.week6;

public class Address {

    public String street, city, state, zipCode, country;// using public is not a big deal. you can not use that.


    public void setInfo(String street, String city, String state, String zipCode, String country) {
        this.street = street;  //this ---> is a reference to current class object
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String toString() {
        return street + "\n" + city + ", " + state + " " + zipCode + "\n" + country;

    }
}


/*
Address [object type]

	create a class called Address
	declare these instance variables:
		street, city, state, zipcode, country

	create a setInfo() method to initialize these variables

	create a toString() that shows the full address in the following format
		$street
		$city, $state $zipcode
		$country

	create a different class and create some Address objects
 */