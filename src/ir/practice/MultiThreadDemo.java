package ir.practice;

public class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MultiThreading multiThreading = new MultiThreading();
        MultiThreading multiThreading2 = new MultiThreading();

        Thread thread = new Thread(new MultiThreading());
        thread.start();
        thread.join();
    }
}
