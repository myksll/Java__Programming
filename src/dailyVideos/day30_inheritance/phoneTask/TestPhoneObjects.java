package dailyVideos.day30_inheritance.phoneTask;



public class TestPhoneObjects {

    public static void main(String[] args) {

        IPhone iphone= new IPhone("14", "Large",1000.5,"White");

        Samsung samsung= new Samsung("S22", "Medium",400.5,"White");

       Nokia nokia= new Nokia("Brick", "Small","White",55);


        iphone.call(985);
        samsung.call(365);
        nokia.call(478);

        iphone.text(455322121);
        samsung.text(54543544);
        nokia.text(54165351);

         iphone.faceTime(425434);
         samsung.freeze();
         nokia.selfDefense();





    }
}
