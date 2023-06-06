package WednesdayOfficeHours.week12.appClass;

public class TestAppClass {
    public static void main(String[] args) {

        App app = new App("Pro 11");
        System.out.println(app);

        app.method();

        System.out.println("-------------------------------------------------");

        Instagram instagram = new Instagram("version 3.1");

        System.out.println(instagram);

        instagram.method();
        instagram.postPicture();
        System.out.println("-------------------------------------------------");

        Youtube youtube = new Youtube("version 4.1");

        System.out.println(youtube);

        youtube.method();
        youtube.watchVideo();

        System.out.println("-------------------------------------------------");


    }
}
