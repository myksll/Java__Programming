package practices.day06_practices;

public class MedianNumber {
    public static void main(String[] args) {


      int a= 3;
      int b= 17;
      int c= 8;

     boolean aIsMedian= (a>b && a<c) || (a>c && a<b);                       //a=15 b=10 c=20 or a=15 b=20 c=10
     boolean bIsMedian= (b>a && b<c)  ||  (b>c && b<a);                     // a=10 b=15 c=20 or a=20 b=15 c=10
     boolean cIsMedian= !aIsMedian && !bIsMedian;                           // a=10 b=20 c=15 or a=20 b=10 c=15




      if (aIsMedian){
          System.out.println(a+ " is the median number");
      }

        if (bIsMedian){
            System.out.println(b+ " is the median number");
        }


        if (cIsMedian){
            System.out.println(c+ " is the median number");
        }











    }
}
