package practices.day31_practices.browserTask;

public class TestBrowser {
    public static void main(String[] args) {


        Chrome chromeBrowser=new Chrome();
        chromeBrowser.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.openBrowser();

        Opera opera=new Opera();
        opera.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();





    }
}
