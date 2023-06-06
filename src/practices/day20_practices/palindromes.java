package practices.day20_practices;

import java.util.Arrays;

public class palindromes {
    public static void main(String[] args) {

        String[] str = {"anna", "level", "Java"};

        int count=0;

        for (String each : str){
            String reverse= "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){
                count++;
            }
        }
        System.out.println(count);
    }
    }

/*
3. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */