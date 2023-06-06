package practices.day08_practices;

public class BiggerNum {
    public static void main(String[] args) {


        int n1=445,
            n2=445,
            n3=9;


        String result=(n1>n2 && n1>n3) ? "n1 is bigger" : (n2>n1 && n2>n3) ?"n2 is bigger"
                     :(n3>n2 && n3>n1) ? "n3 is bigger" : "different situation";

        System.out.println(result);
    }
}
