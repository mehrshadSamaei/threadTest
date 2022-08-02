package ir.mehrshad;

public class ThreadSimple extends Thread {
    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("hello" + currentThread());
                Thread.sleep(100);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                e.getMessage();
                System.out.println("intrrupt exception!");
                flag = false;
            }
        }

    }
}
