package dailyVideos.day39_collections.multiThreading;

public class TestMultiThreading {
    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

       // thread1.run(); //they will not be executed at the same time .
       // thread2.run();

        thread1.start(); //they will be executed at the same time .
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
