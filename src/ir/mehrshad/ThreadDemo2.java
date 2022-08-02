package ir.mehrshad;

public class ThreadDemo2 {
    public static void main(String[] args) {
        final CheckingAccount ca = new CheckingAccount(100);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(name + "withdraws 10$" + ca.withdraw(10));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thdHusband = new Thread(r);
        thdHusband.setName("Husband");
        Thread thdWife = new Thread(r);
        thdWife.setName("Wife");
        thdHusband.start();
        thdWife.start();
    }
}
