package ir.practice;

public class ThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            ThreadUtil util = new ThreadUtil();
            util.start();
        }
    }
}
