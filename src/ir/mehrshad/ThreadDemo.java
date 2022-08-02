package ir.mehrshad;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadSimple threadSimple = new ThreadSimple();
        threadSimple.start();
        Thread.sleep(2000);
        threadSimple.interrupt();

    }
}
