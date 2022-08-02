package ir.practice;

public class MultiThreading implements Runnable {
    private int threadNum;

    public MultiThreading(int threadNum) {
        this.threadNum = threadNum;
    }

    public MultiThreading() {

    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
