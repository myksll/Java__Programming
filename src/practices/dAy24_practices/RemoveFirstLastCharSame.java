package practices.dAy24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFirstLastCharSame {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(p-> p.toLowerCase().charAt(0)==p.toLowerCase().charAt(p.length()-1));
        System.out.println(list);//[Canada, Lan, Ebrahim, Farida]



    }
}
/*
7. Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]

 */