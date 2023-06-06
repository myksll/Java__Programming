package dailyVideos.day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread {    //we can execute  at the same time( concurrently).

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {  //i want to print Hello World 5 times
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World "+i+ " from Thread " + +threadNumber);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
              }
             }
        }
    }
