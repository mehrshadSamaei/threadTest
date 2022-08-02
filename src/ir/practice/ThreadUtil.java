package ir.practice;

public class ThreadUtil extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(i + "thread number" + Thread.currentThread());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
